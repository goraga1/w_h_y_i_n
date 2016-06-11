package com.whyinside.whyinside.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.adapters.RestaurantRecyclerAdapter;
import com.whyinside.whyinside.models.restaurant.Restaurant;
import com.whyinside.whyinside.models.restaurant.RestaurantsStatus;
import com.whyinside.whyinside.services.MClient;
import com.whyinside.whyinside.services.ServiceGenerator;
import com.whyinside.whyinside.utils.DividerItemDecoration;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantListFragment extends Fragment {
    @Bind(R.id.recicler_view)
    RecyclerView mRecyclerView;

    @Bind(R.id.restProgress)
    ProgressBar restProgress;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_list, null);
        ButterKnife.bind(this, view);
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
        mRecyclerView.setAdapter(new RestaurantRecyclerAdapter(getActivity(), restaurantList));
        mRecyclerView.setVisibility(View.VISIBLE);
        restProgress.setVisibility(View.GONE);
    }


    private void requestData() {
        MClient client = ServiceGenerator.createService(MClient.class);

        Call<RestaurantsStatus> call = client.restaurantList();
        call.enqueue(new Callback<RestaurantsStatus>() {
            @Override
            public void onResponse(Call<RestaurantsStatus> call, Response<RestaurantsStatus> response) {
                setDataToAdapter(response.body().getData());
            }

            @Override
            public void onFailure(Call<RestaurantsStatus> call, Throwable t) {
                System.out.print("Error" + t.getMessage());
            }
        });

    }

}
