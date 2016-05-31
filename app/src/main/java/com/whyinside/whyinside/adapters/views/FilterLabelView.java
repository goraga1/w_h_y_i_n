package com.whyinside.whyinside.adapters.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.models.filter.FilterData;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by GorA on 5/31/16.
 */
public class FilterLabelView extends AbstractView {


    @Bind(R.id.filterLabel)
    TextView filterLabel;

    @Override
    public void bind(Object data) {
        FilterData currentData = (FilterData) data;
        filterLabel.setText(currentData.getName());
    }

    public FilterLabelView(Context context, ViewGroup parent) {
        this(context, LayoutInflater.from(context).inflate(R.layout.filter_label_item, parent, false));

    }

    public FilterLabelView(final Context context, View view) {
        super(view, context);
        ButterKnife.bind(this, view);
        this.context = context;

    }
}
