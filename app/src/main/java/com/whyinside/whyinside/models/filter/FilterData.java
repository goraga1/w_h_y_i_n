
package com.whyinside.whyinside.models.filter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FilterData {


    @SerializedName("city")
    @Expose
    private List<String> city = new ArrayList<String>();
    @SerializedName("cuisine")
    @Expose
    private List<String> cuisine = new ArrayList<String>();

    /**
     * 
     * @return
     *     The city
     */
    public List<String> getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(List<String> city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The cuisine
     */
    public List<String> getCuisine() {
        return cuisine;
    }

    /**
     * 
     * @param cuisine
     *     The cuisine
     */
    public void setCuisine(List<String> cuisine) {
        this.cuisine = cuisine;
    }

}
