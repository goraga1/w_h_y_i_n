
package com.whyinside.whyinside.models.restaurant;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Restaurant {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("u_name")
    @Expose
    private String uName;
    @SerializedName("slogan")
    @Expose
    private String slogan;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("has_spanish")
    @Expose
    private String hasSpanish;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("owner_id")
    @Expose
    private String ownerId;
    @SerializedName("poc_id")
    @Expose
    private String pocId;
    @SerializedName("meal_ranges")
    @Expose
    private String mealRanges;
    @SerializedName("lunch_special_ranges")
    @Expose
    private String lunchSpecialRanges;
    @SerializedName("pizza_ranges")
    @Expose
    private String pizzaRanges;
    @SerializedName("takes_cash")
    @Expose
    private String takesCash;
    @SerializedName("pickup_time")
    @Expose
    private String pickupTime;
    @SerializedName("delivery_time")
    @Expose
    private String deliveryTime;
    @SerializedName("order_times")
    @Expose
    private String orderTimes;
    @SerializedName("delivery_zipcodes")
    @Expose
    private String deliveryZipcodes;
    @SerializedName("block_limits")
    @Expose
    private String blockLimits;
    @SerializedName("cuisine")
    @Expose
    private String cuisine;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("delivery_minimum")
    @Expose
    private String deliveryMinimum;
    @SerializedName("delivery_charge")
    @Expose
    private String deliveryCharge;
    @SerializedName("order_minimum")
    @Expose
    private String orderMinimum;
    @SerializedName("delivery_prices")
    @Expose
    private String deliveryPrices;
    @SerializedName("monday")
    @Expose
    private String monday;
    @SerializedName("tuesday")
    @Expose
    private String tuesday;
    @SerializedName("wednesday")
    @Expose
    private String wednesday;
    @SerializedName("thursday")
    @Expose
    private String thursday;
    @SerializedName("friday")
    @Expose
    private String friday;
    @SerializedName("saturday")
    @Expose
    private String saturday;
    @SerializedName("sunday")
    @Expose
    private String sunday;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("tax")
    @Expose
    private String tax;
    @SerializedName("tax_included")
    @Expose
    private String taxIncluded;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("maximum_combo_order")
    @Expose
    private String maximumComboOrder;
    @SerializedName("can_order_ahead")
    @Expose
    private String canOrderAhead;
    @SerializedName("catering_time")
    @Expose
    private String cateringTime;
    @SerializedName("catering")
    @Expose
    private String catering;
    @SerializedName("first_order_discount")
    @Expose
    private String firstOrderDiscount;
    @SerializedName("closed_down")
    @Expose
    private String closedDown;
    @SerializedName("suggest_addons")
    @Expose
    private String suggestAddons;
    @SerializedName("reason_closed_down")
    @Expose
    private String reasonClosedDown;
    @SerializedName("order_invite")
    @Expose
    private String orderInvite;
    @SerializedName("customize_menu")
    @Expose
    private String customizeMenu;
    @SerializedName("customize_specials")
    @Expose
    private String customizeSpecials;
    @SerializedName("target_ratio")
    @Expose
    private String targetRatio;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("yelp")
    @Expose
    private String yelp;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;

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
    public String getSlogan() {
        return slogan;
    }

    /**
     * @param slogan The slogan
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The hasSpanish
     */
    public String getHasSpanish() {
        return hasSpanish;
    }

    /**
     * @param hasSpanish The has_spanish
     */
    public void setHasSpanish(String hasSpanish) {
        this.hasSpanish = hasSpanish;
    }

    /**
     * @return The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId The owner_id
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return The pocId
     */
    public String getPocId() {
        return pocId;
    }

    /**
     * @param pocId The poc_id
     */
    public void setPocId(String pocId) {
        this.pocId = pocId;
    }

    /**
     * @return The mealRanges
     */
    public String getMealRanges() {
        return mealRanges;
    }

    /**
     * @param mealRanges The meal_ranges
     */
    public void setMealRanges(String mealRanges) {
        this.mealRanges = mealRanges;
    }

    /**
     * @return The lunchSpecialRanges
     */
    public String getLunchSpecialRanges() {
        return lunchSpecialRanges;
    }

    /**
     * @param lunchSpecialRanges The lunch_special_ranges
     */
    public void setLunchSpecialRanges(String lunchSpecialRanges) {
        this.lunchSpecialRanges = lunchSpecialRanges;
    }

    /**
     * @return The pizzaRanges
     */
    public String getPizzaRanges() {
        return pizzaRanges;
    }

    /**
     * @param pizzaRanges The pizza_ranges
     */
    public void setPizzaRanges(String pizzaRanges) {
        this.pizzaRanges = pizzaRanges;
    }

    /**
     * @return The takesCash
     */
    public String getTakesCash() {
        return takesCash;
    }

    /**
     * @param takesCash The takes_cash
     */
    public void setTakesCash(String takesCash) {
        this.takesCash = takesCash;
    }

    /**
     * @return The pickupTime
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * @param pickupTime The pickup_time
     */
    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    /**
     * @return The deliveryTime
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * @param deliveryTime The delivery_time
     */
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * @return The orderTimes
     */
    public String getOrderTimes() {
        return orderTimes;
    }

    /**
     * @param orderTimes The order_times
     */
    public void setOrderTimes(String orderTimes) {
        this.orderTimes = orderTimes;
    }

    /**
     * @return The deliveryZipcodes
     */
    public String getDeliveryZipcodes() {
        return deliveryZipcodes;
    }

    /**
     * @param deliveryZipcodes The delivery_zipcodes
     */
    public void setDeliveryZipcodes(String deliveryZipcodes) {
        this.deliveryZipcodes = deliveryZipcodes;
    }

    /**
     * @return The blockLimits
     */
    public String getBlockLimits() {
        return blockLimits;
    }

    /**
     * @param blockLimits The block_limits
     */
    public void setBlockLimits(String blockLimits) {
        this.blockLimits = blockLimits;
    }

    /**
     * @return The cuisine
     */
    public String getCuisine() {
        return cuisine;
    }

    /**
     * @param cuisine The cuisine
     */
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return The state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return The fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax The fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return The deliveryMinimum
     */
    public String getDeliveryMinimum() {
        return deliveryMinimum;
    }

    /**
     * @param deliveryMinimum The delivery_minimum
     */
    public void setDeliveryMinimum(String deliveryMinimum) {
        this.deliveryMinimum = deliveryMinimum;
    }

    /**
     * @return The deliveryCharge
     */
    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    /**
     * @param deliveryCharge The delivery_charge
     */
    public void setDeliveryCharge(String deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    /**
     * @return The orderMinimum
     */
    public String getOrderMinimum() {
        return orderMinimum;
    }

    /**
     * @param orderMinimum The order_minimum
     */
    public void setOrderMinimum(String orderMinimum) {
        this.orderMinimum = orderMinimum;
    }

    /**
     * @return The deliveryPrices
     */
    public String getDeliveryPrices() {
        return deliveryPrices;
    }

    /**
     * @param deliveryPrices The delivery_prices
     */
    public void setDeliveryPrices(String deliveryPrices) {
        this.deliveryPrices = deliveryPrices;
    }

    /**
     * @return The monday
     */
    public String getMonday() {
        return monday;
    }

    /**
     * @param monday The monday
     */
    public void setMonday(String monday) {
        this.monday = monday;
    }

    /**
     * @return The tuesday
     */
    public String getTuesday() {
        return tuesday;
    }

    /**
     * @param tuesday The tuesday
     */
    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    /**
     * @return The wednesday
     */
    public String getWednesday() {
        return wednesday;
    }

    /**
     * @param wednesday The wednesday
     */
    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    /**
     * @return The thursday
     */
    public String getThursday() {
        return thursday;
    }

    /**
     * @param thursday The thursday
     */
    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    /**
     * @return The friday
     */
    public String getFriday() {
        return friday;
    }

    /**
     * @param friday The friday
     */
    public void setFriday(String friday) {
        this.friday = friday;
    }

    /**
     * @return The saturday
     */
    public String getSaturday() {
        return saturday;
    }

    /**
     * @param saturday The saturday
     */
    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    /**
     * @return The sunday
     */
    public String getSunday() {
        return sunday;
    }

    /**
     * @param sunday The sunday
     */
    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    /**
     * @return The active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active The active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return The dateAdded
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded The date_added
     */
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    /**
     * @return The tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * @param tax The tax
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * @return The taxIncluded
     */
    public String getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * @param taxIncluded The tax_included
     */
    public void setTaxIncluded(String taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * @return The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @param timezone The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * @return The maximumComboOrder
     */
    public String getMaximumComboOrder() {
        return maximumComboOrder;
    }

    /**
     * @param maximumComboOrder The maximum_combo_order
     */
    public void setMaximumComboOrder(String maximumComboOrder) {
        this.maximumComboOrder = maximumComboOrder;
    }

    /**
     * @return The canOrderAhead
     */
    public String getCanOrderAhead() {
        return canOrderAhead;
    }

    /**
     * @param canOrderAhead The can_order_ahead
     */
    public void setCanOrderAhead(String canOrderAhead) {
        this.canOrderAhead = canOrderAhead;
    }

    /**
     * @return The cateringTime
     */
    public String getCateringTime() {
        return cateringTime;
    }

    /**
     * @param cateringTime The catering_time
     */
    public void setCateringTime(String cateringTime) {
        this.cateringTime = cateringTime;
    }

    /**
     * @return The catering
     */
    public String getCatering() {
        return catering;
    }

    /**
     * @param catering The catering
     */
    public void setCatering(String catering) {
        this.catering = catering;
    }

    /**
     * @return The firstOrderDiscount
     */
    public String getFirstOrderDiscount() {
        return firstOrderDiscount;
    }

    /**
     * @param firstOrderDiscount The first_order_discount
     */
    public void setFirstOrderDiscount(String firstOrderDiscount) {
        this.firstOrderDiscount = firstOrderDiscount;
    }

    /**
     * @return The closedDown
     */
    public String getClosedDown() {
        return closedDown;
    }

    /**
     * @param closedDown The closed_down
     */
    public void setClosedDown(String closedDown) {
        this.closedDown = closedDown;
    }

    /**
     * @return The suggestAddons
     */
    public String getSuggestAddons() {
        return suggestAddons;
    }

    /**
     * @param suggestAddons The suggest_addons
     */
    public void setSuggestAddons(String suggestAddons) {
        this.suggestAddons = suggestAddons;
    }

    /**
     * @return The reasonClosedDown
     */
    public String getReasonClosedDown() {
        return reasonClosedDown;
    }

    /**
     * @param reasonClosedDown The reason_closed_down
     */
    public void setReasonClosedDown(String reasonClosedDown) {
        this.reasonClosedDown = reasonClosedDown;
    }

    /**
     * @return The orderInvite
     */
    public String getOrderInvite() {
        return orderInvite;
    }

    /**
     * @param orderInvite The order_invite
     */
    public void setOrderInvite(String orderInvite) {
        this.orderInvite = orderInvite;
    }

    /**
     * @return The customizeMenu
     */
    public String getCustomizeMenu() {
        return customizeMenu;
    }

    /**
     * @param customizeMenu The customize_menu
     */
    public void setCustomizeMenu(String customizeMenu) {
        this.customizeMenu = customizeMenu;
    }

    /**
     * @return The customizeSpecials
     */
    public String getCustomizeSpecials() {
        return customizeSpecials;
    }

    /**
     * @param customizeSpecials The customize_specials
     */
    public void setCustomizeSpecials(String customizeSpecials) {
        this.customizeSpecials = customizeSpecials;
    }

    /**
     * @return The targetRatio
     */
    public String getTargetRatio() {
        return targetRatio;
    }

    /**
     * @param targetRatio The target_ratio
     */
    public void setTargetRatio(String targetRatio) {
        this.targetRatio = targetRatio;
    }

    /**
     * @return The twitter
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * @param twitter The twitter
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return The facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook The facebook
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return The yelp
     */
    public String getYelp() {
        return yelp;
    }

    /**
     * @param yelp The yelp
     */
    public void setYelp(String yelp) {
        this.yelp = yelp;
    }

    /**
     * @return The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

}
