package com.whyinside.whyinside.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.whyinside.whyinside.adapters.views.AbstractView;
import com.whyinside.whyinside.adapters.views.FilterCheckboxView;
import com.whyinside.whyinside.adapters.views.FilterLabelView;
import com.whyinside.whyinside.adapters.views.RestaurantView;
import com.whyinside.whyinside.models.filter.FilterData;
import com.whyinside.whyinside.models.restaurant.RestaurantData;

import java.util.ArrayList;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantRecyclerAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private LayoutInflater mInflater;
    private ArrayList<RestaurantData> mItems;
    private Context context;

    private static final int VIEW_TYPE_ITEM = 1;

    public RestaurantRecyclerAdapter(Context context, ArrayList<RestaurantData> items) {
        mInflater = LayoutInflater.from(context);
        mItems = items;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        AbstractView neededView;
        neededView = new RestaurantView(context, parent);

        return neededView;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AbstractView abstractView = (AbstractView) holder;
        RestaurantData filterData = mItems.get(position);

        abstractView.bind(filterData);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {
       return VIEW_TYPE_ITEM;
    }
}
