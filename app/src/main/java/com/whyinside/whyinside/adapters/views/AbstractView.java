package com.whyinside.whyinside.adapters.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by GorA on 5/31/16.
 */

public abstract class AbstractView extends RecyclerView.ViewHolder {

    protected Context context;

    public AbstractView(View cardView, Context context) {
        super(cardView);
        this.context = context;
    }

    public abstract void bind(Object data);

}