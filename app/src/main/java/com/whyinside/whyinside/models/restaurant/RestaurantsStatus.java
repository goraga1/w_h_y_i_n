package com.whyinside.whyinside.models.restaurant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsStatus  {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("total")
    @Expose
    private String total;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
