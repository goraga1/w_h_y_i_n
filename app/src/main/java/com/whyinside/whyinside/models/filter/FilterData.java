package com.whyinside.whyinside.models.filter;

/**
 * Created by GorA on 5/31/16.
 */
public class FilterData {
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
