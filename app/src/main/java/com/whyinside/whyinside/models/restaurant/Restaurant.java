
package com.whyinside.whyinside.models.restaurant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Restaurant implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("u_name")
    @Expose
    private String uName;
    //    @SerializedName("slogan")
//    @Expose
//    private String slogan;
//    @SerializedName("description")
//    @Expose
//    private String description;
//    @SerializedName("has_spanish")
//    @Expose
//    private String hasSpanish;
//    @SerializedName("website")
//    @Expose
//    private String website;
//    @SerializedName("email")
//    @Expose
//    private String email;
//    @SerializedName("owner_id")
//    @Expose
//    private String ownerId;
//    @SerializedName("poc_id")
//    @Expose
//    private String pocId;
////    @SerializedName("lunch_special_ranges")
////    @Expose
////    private String lunchSpecialRanges;
//    @SerializedName("pizza_ranges")
//    @Expose
//    private String pizzaRanges;
//    @SerializedName("takes_cash")
//    @Expose
//    private String takesCash;
//    @SerializedName("pickup_time")
//    @Expose
//    private String pickupTime;
//    @SerializedName("delivery_time")
//    @Expose
//    private String deliveryTime;
//    @SerializedName("order_times")
//    @Expose
//    private String orderTimes;
//    @SerializedName("delivery_zipcodes")
//    @Expose
//    private String deliveryZipcodes;
//    @SerializedName("block_limits")
//    @Expose
//    private List<String> blockLimits = new ArrayList<String>();
//    @SerializedName("cuisine")
//    @Expose
//    private String cuisine;
//    @SerializedName("address")
//    @Expose
//    private String address;
//    @SerializedName("zipcode")
//    @Expose
//    private String zipcode;
//    @SerializedName("state")
//    @Expose
//    private String state;
//    @SerializedName("city")
//    @Expose
//    private String city;
//    @SerializedName("phone")
//    @Expose
//    private String phone;
//    @SerializedName("fax")
//    @Expose
//    private String fax;
//    @SerializedName("delivery_minimum")
//    @Expose
//    private String deliveryMinimum;
//    @SerializedName("delivery_charge")
//    @Expose
//    private String deliveryCharge;
//    @SerializedName("order_minimum")
//    @Expose
//    private String orderMinimum;
//    @SerializedName("delivery_prices")
//    @Expose
//    private String deliveryPrices;
//    @SerializedName("monday")
//    @Expose
//    private String monday;
//    @SerializedName("tuesday")
//    @Expose
//    private String tuesday;
//    @SerializedName("wednesday")
//    @Expose
//    private String wednesday;
//    @SerializedName("thursday")
//    @Expose
//    private String thursday;
//    @SerializedName("friday")
//    @Expose
//    private String friday;
//    @SerializedName("saturday")
//    @Expose
//    private String saturday;
//    @SerializedName("sunday")
//    @Expose
//    private String sunday;
//    @SerializedName("active")
//    @Expose
//    private String active;
//    @SerializedName("date_added")
//    @Expose
//    private String dateAdded;
//    @SerializedName("tax")
//    @Expose
//    private String tax;
//    @SerializedName("tax_included")
//    @Expose
//    private String taxIncluded;
//    @SerializedName("timezone")
//    @Expose
//    private String timezone;
//    @SerializedName("maximum_combo_order")
//    @Expose
//    private String maximumComboOrder;
//    @SerializedName("can_order_ahead")
//    @Expose
//    private String canOrderAhead;
//    @SerializedName("catering_time")
//    @Expose
//    private String cateringTime;
//    @SerializedName("catering")
//    @Expose
//    private String catering;
//    @SerializedName("first_order_discount")
//    @Expose
//    private String firstOrderDiscount;
//    @SerializedName("closed_down")
//    @Expose
//    private String closedDown;
//    @SerializedName("suggest_addons")
//    @Expose
//    private String suggestAddons;
//    @SerializedName("reason_closed_down")
//    @Expose
//    private String reasonClosedDown;
//    @SerializedName("order_invite")
//    @Expose
//    private String orderInvite;
//    @SerializedName("customize_menu")
//    @Expose
//    private String customizeMenu;
//    @SerializedName("customize_specials")
//    @Expose
//    private String customizeSpecials;
//    @SerializedName("target_ratio")
//    @Expose
//    private String targetRatio;
//    @SerializedName("twitter")
//    @Expose
//    private String twitter;
//    @SerializedName("facebook")
//    @Expose
//    private String facebook;
//    @SerializedName("yelp")
//    @Expose
//    private String yelp;
//    @SerializedName("longitude")
//    @Expose
//    private String longitude;
//    @SerializedName("latitude")
//    @Expose
//    private String latitude;
    @SerializedName("image")
    @Expose
    private String image;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The uName
     */
    public String getUName() {
        return uName;
    }

    /**
     * @param uName The u_name
     */
    public void setUName(String uName) {
        this.uName = uName;
    }

    /**
     * @return The slogan
     */

    /**
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(String image) {
        this.image = image;
    }

}
