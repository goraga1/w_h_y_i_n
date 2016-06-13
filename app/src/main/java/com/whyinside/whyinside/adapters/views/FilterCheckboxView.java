package com.whyinside.whyinside.adapters.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.models.filter.FilterCollectedData;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by GorA on 5/31/16.
 */
public class FilterCheckboxView extends AbstractView {


    @Bind(R.id.filterCheckBox)
    CheckBox filterCheckBox;

    @Override
    public void bind(Object data) {
        FilterCollectedData currentData = (FilterCollectedData) data;
        filterCheckBox.setText(currentData.getTitle());
    }

    public FilterCheckboxView(Context context, ViewGroup parent) {
        this(context, LayoutInflater.from(context).inflate(R.layout.filter_checkbox_item, parent, false));

    }

    public FilterCheckboxView(final Context context, View view) {
        super(view, context);
        ButterKnife.bind(this, view);
        this.context = context;

    }
}
