package com.whyinside.whyinside.adapters.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.models.restaurant.Restaurant;
import com.whyinside.whyinside.views.WhyInsideStarsView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantView extends AbstractView {
    @Bind(R.id.item_name)
    TextView mName;

    @Bind(R.id.rate_view)
    WhyInsideStarsView mStartView;
    @Override
    public void bind(Object data) {
        Restaurant currentData = (Restaurant) data;
        mName.setText(currentData.getName());
        mStartView.setRate(3.8f);
    }

    public RestaurantView(Context context, ViewGroup parent) {
        this(context, LayoutInflater.from(context).inflate(R.layout.restaurant_list_item, parent, false));

    }

    public RestaurantView(final Context context, View view) {
        super(view, context);
        ButterKnife.bind(this, view);
        this.context = context;
    }
}
