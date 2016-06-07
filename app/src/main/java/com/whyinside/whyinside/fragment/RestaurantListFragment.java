package com.whyinside.whyinside.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.adapters.FilterRecyclerAdapter;
import com.whyinside.whyinside.adapters.RestaurantRecyclerAdapter;
import com.whyinside.whyinside.models.filter.FilterData;
import com.whyinside.whyinside.models.restaurant.RestaurantData;
import com.whyinside.whyinside.utils.DividerItemDecoration;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantListFragment extends Fragment {
    @Bind(R.id.recicler_view)
    RecyclerView mRecyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_list, null);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayoutManager ln = new LinearLayoutManager(getActivity());
        ln.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));
        mRecyclerView.setLayoutManager(ln);

        ArrayList<RestaurantData> a = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            RestaurantData fd = new RestaurantData();

            fd.setName("3 Way Restaurant");
            a.add(fd);

        }

        mRecyclerView.setAdapter(new RestaurantRecyclerAdapter(getActivity(), a));
    }
}
