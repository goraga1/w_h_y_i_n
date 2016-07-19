package com.whyinside.whyinside.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.utils.DividerItemDecoration;

import butterknife.ButterKnife;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantDetailsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_details, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        LinearLayoutManager ln = new LinearLayoutManager(getActivity());
//        ln.setOrientation(LinearLayoutManager.VERTICAL);
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
//        mRecyclerView.setLayoutManager(ln);
//        requestData();
    }

}
