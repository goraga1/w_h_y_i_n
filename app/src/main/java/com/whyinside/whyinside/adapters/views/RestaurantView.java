package com.whyinside.whyinside.adapters.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.models.restaurant.Restaurant;
import com.whyinside.whyinside.utils.PicassoHelper;
import com.whyinside.whyinside.views.WhyInsideStarsView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantView extends AbstractView {
    @Bind(R.id.item_name)
    TextView mName;

    @Bind(R.id.rest_image)

    ImageView mImageView;

    @Bind(R.id.item_place)
    TextView mPlace;

    @Bind(R.id.rate_view)
    WhyInsideStarsView mStartView;

    @Override
    public void bind(Object data) {
        Restaurant currentData = (Restaurant) data;
        mName.setText(currentData.getName());
        mPlace.setText(currentData.getCity());
        mStartView.setRate(3.8f);

        if (!currentData.getImage().equals(""))
            PicassoHelper.loadImageURL(currentData.getImage(), mImageView, null, 0);
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
