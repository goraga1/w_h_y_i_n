package com.whyinside.whyinside.listener;

import com.whyinside.whyinside.models.restaurant.Restaurant;

/**
 * Created by Gor on 29/05/2016.
 */
public interface RestaurantNavigationListener {
    void OnRestarutantDetails(Restaurant restaurant);
    void OnRestaurantList();
}
