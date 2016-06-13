package com.whyinside.whyinside.services;

import com.whyinside.whyinside.models.filter.Filter;
import com.whyinside.whyinside.models.restaurant.RestaurantsStatus;
import com.whyinside.whyinside.services.models.LoginData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MClient {

    @POST("~fbapp/whyinsidemenu/?action=login?&user=test@gmail.com&pass=test")
    Call<LoginData> singIn();


    @GET("~fbapp/whyinsidemenu/?source=restaurants&total=1&session_id=b81884bda1f4e5b05dfd556fa6c8bf4a")
    Call<RestaurantsStatus> restaurantList();


    @GET("~fbapp/whyinsidemenu/?action=get_filters")
    Call<Filter> filtersList();

}
