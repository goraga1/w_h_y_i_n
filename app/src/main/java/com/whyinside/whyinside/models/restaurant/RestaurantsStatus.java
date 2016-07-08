
package com.whyinside.whyinside.models.restaurant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.whyinside.whyinside.models.Response;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsStatus extends Response {

    @SerializedName("data")
    @Expose
    private List<Restaurant> data = new ArrayList<Restaurant>();

    /**
     * @return The data
     */
    public List<Restaurant> getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(List<Restaurant> data) {
        this.data = data;
    }

}
