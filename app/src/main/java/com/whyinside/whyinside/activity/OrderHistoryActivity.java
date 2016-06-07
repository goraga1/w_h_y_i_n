package com.whyinside.whyinside.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.whyinside.whyinside.R;
import com.whyinside.whyinside.adapters.OrderHistoryAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 06/06/2016.
 */
public class OrderHistoryActivity extends BaseMenuActivity {

    @Bind(R.id.main_recycler)
    RecyclerView recycler;

    OrderHistoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        adapter = new OrderHistoryAdapter(this);
        adapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_order_history;
    }
}
