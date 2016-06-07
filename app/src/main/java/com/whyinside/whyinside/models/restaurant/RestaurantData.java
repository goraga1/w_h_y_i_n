package com.whyinside.whyinside.models.restaurant;

/**
 * Created by Hayk on 06/06/2016.
 */
public class RestaurantData {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    int viewType = -1;
}
