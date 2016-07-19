package com.whyinside.whyinside.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.adapters.RestaurantRecyclerAdapter;
import com.whyinside.whyinside.models.restaurant.Restaurant;
import com.whyinside.whyinside.models.restaurant.RestaurantsStatus;
import com.whyinside.whyinside.services.MClient;
import com.whyinside.whyinside.services.ServiceGenerator;
import com.whyinside.whyinside.utils.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantListFragment extends Fragment implements SearchView.OnQueryTextListener {
    @Bind(R.id.recicler_view)
    RecyclerView mRecyclerView;

    @Bind(R.id.restProgress)
    ProgressBar restProgress;

    private List<Restaurant> restaurantList;
    private RestaurantRecyclerAdapter restaurantRecyclerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_list, null);
        ButterKnife.bind(this, view);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayoutManager ln = new LinearLayoutManager(getActivity());
        ln.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        mRecyclerView.setLayoutManager(ln);
        requestData();


    }

    private void setDataToAdapter(List<Restaurant> restaurantList) {
        restaurantRecyclerAdapter = new RestaurantRecyclerAdapter(getActivity(), restaurantList);
        mRecyclerView.setAdapter(restaurantRecyclerAdapter);
        mRecyclerView.setVisibility(View.VISIBLE);
        restProgress.setVisibility(View.GONE);
    }


    private void requestData() {
        MClient client = ServiceGenerator.createService(MClient.class);

        Call<RestaurantsStatus> call = client.restaurantList();
        call.enqueue(new Callback<RestaurantsStatus>() {
            @Override
            public void onResponse(Call<RestaurantsStatus> call, Response<RestaurantsStatus> response) {
                List<Restaurant> data = response.body().getData();
                restaurantList = data;
                setDataToAdapter(restaurantList);
            }

            @Override
            public void onFailure(Call<RestaurantsStatus> call, Throwable t) {
                System.out.print("Error" + t.getMessage());
            }
        });

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuItem item = menu.add("Search");
        item.setIcon(R.drawable.ic_search); // sets icon
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        SearchView sv = new SearchView(getActivity());

        // modifying the text inside edittext component
        TextView textView = (TextView) sv.findViewById(android.support.v7.appcompat.R.id.search_src_text);

        textView.setHint("Search place...");
        textView.setHintTextColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));
        textView.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));

        // implementing the listener
        sv.setOnQueryTextListener(this);
        item.setActionView(sv);
    }


    @Override
    public boolean onQueryTextChange(String query) {

        final List<Restaurant> filteredModelList = filter(restaurantList, query);
        restaurantRecyclerAdapter.animateTo(filteredModelList);
        mRecyclerView.scrollToPosition(0);
        return true;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    private List<Restaurant> filter(List<Restaurant> models, String query) {
        query = query.toLowerCase();

        final List<Restaurant> filteredModelList = new ArrayList<>();
        for (Restaurant model : models) {
            final String text = model.getName().toLowerCase();
            if (text.contains(query)) {
                filteredModelList.add(model);
            }
        }
        return filteredModelList;
    }

}
