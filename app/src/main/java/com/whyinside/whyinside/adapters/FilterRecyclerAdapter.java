package com.whyinside.whyinside.adapters;

/**
 * Created by GorA on 5/31/16.
 */


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.whyinside.whyinside.adapters.views.AbstractView;
import com.whyinside.whyinside.adapters.views.FilterCheckboxView;
import com.whyinside.whyinside.adapters.views.FilterLabelView;
import com.whyinside.whyinside.models.filter.FilterCollectedData;

import java.util.List;

public class FilterRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private LayoutInflater mInflater;
    private List<FilterCollectedData> mItems;
    private Context context;


    private static final int VIEW_TYPE_LABEL = 1;
    private static final int VIEW_TYPE_CHECKBOX = 2;

    public FilterRecyclerAdapter(Context context, List<FilterCollectedData> items) {
        mInflater = LayoutInflater.from(context);

        mItems = items;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {

        switch (mItems.get(position).getViewType()) {
            case 1:
                return VIEW_TYPE_LABEL;
            default:
                return VIEW_TYPE_CHECKBOX;
        }


    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        AbstractView neededView;
        switch (viewType) {

            case VIEW_TYPE_LABEL:
                neededView = new FilterLabelView(context, parent);
                break;
//            case VIEW_TYPE_CHECKBOX:
//                neededView = new FilterCheckboxView(context, parent);
//                break;
            default:
                neededView = new FilterCheckboxView(context, parent);
                break;


        }

        return neededView;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        AbstractView abstractView = (AbstractView) viewHolder;
        FilterCollectedData filterData = mItems.get(position);

        abstractView.bind(filterData);

    }


}
