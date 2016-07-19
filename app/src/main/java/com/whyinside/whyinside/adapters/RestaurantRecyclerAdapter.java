package com.whyinside.whyinside.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.whyinside.whyinside.adapters.views.AbstractView;
import com.whyinside.whyinside.adapters.views.RestaurantView;
import com.whyinside.whyinside.models.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GorA on 06/06/2016.
 */
public class RestaurantRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Restaurant> mItems;
    private Context context;

    private static final int VIEW_TYPE_ITEM = 1;

    public RestaurantRecyclerAdapter(Context context, List<Restaurant> items) {
        mItems = new ArrayList<>(items);

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
        Restaurant filterData = mItems.get(position);

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


    public void animateTo(List<Restaurant> models) {
        applyAndAnimateRemovals(models);
        applyAndAnimateAdditions(models);
        applyAndAnimateMovedItems(models);
    }

    private void applyAndAnimateRemovals(List<Restaurant> newModels) {
        for (int i = mItems.size() - 1; i >= 0; i--) {
            final Restaurant model = mItems.get(i);
            if (!newModels.contains(model)) {
                removeItem(i);
            }
        }
    }

    private void applyAndAnimateAdditions(List<Restaurant> newModels) {
        for (int i = 0, count = newModels.size(); i < count; i++) {
            final Restaurant model = newModels.get(i);
            if (!mItems.contains(model)) {
                addItem(i, model);
            }
        }
    }

    private void applyAndAnimateMovedItems(List<Restaurant> newModels) {
        for (int toPosition = newModels.size() - 1; toPosition >= 0; toPosition--) {
            final Restaurant model = newModels.get(toPosition);
            final int fromPosition = mItems.indexOf(model);
            if (fromPosition >= 0 && fromPosition != toPosition) {
                moveItem(fromPosition, toPosition);
            }
        }
    }

    public Restaurant removeItem(int position) {
        final Restaurant model = mItems.remove(position);
        notifyItemRemoved(position);
        return model;
    }

    public void addItem(int position, Restaurant model) {
        mItems.add(position, model);
        notifyItemInserted(position);
    }

    public void moveItem(int fromPosition, int toPosition) {
        final Restaurant model = mItems.remove(fromPosition);
        mItems.add(toPosition, model);
        notifyItemMoved(fromPosition, toPosition);
    }

}
