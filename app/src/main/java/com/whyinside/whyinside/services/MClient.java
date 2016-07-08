package com.whyinside.whyinside.services;

import com.whyinside.whyinside.models.filter.Filter;
import com.whyinside.whyinside.models.restaurant.RestaurantsStatus;
import com.whyinside.whyinside.services.models.LoginData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MClient {

    @POST("~fbapp/whyinsidemenu/?action=login")
    Call<LoginData> singIn(@Query("user") String user, @Query("pass") String pass);


    @GET("~fbapp/whyinsidemenu/?source=restaurants&total")
    Call<RestaurantsStatus> restaurantList();

    @GET("~fbapp/whyinsidemenu/?source=restaurants")
    Call<RestaurantsStatus> restaurantDetails(@Query("id") Integer id);


    @GET("~fbapp/whyinsidemenu/?action=get_filters")
    Call<Filter> filtersList();


}
