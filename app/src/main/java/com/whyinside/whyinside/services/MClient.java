package com.whyinside.whyinside.services;

import com.whyinside.whyinside.models.filter.Filter;
import com.whyinside.whyinside.models.restaurant.RestaurantsStatus;
import com.whyinside.whyinside.services.models.LoginData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MClient {

    @POST("~fbapp/whyinsidemenu/?action=login&user=test@gmail.com&pass=test")
    Call<LoginData> singIn();


    @GET("~fbapp/whyinsidemenu/?source=restaurants&total=1&session_id=16bf3eed70ffef75f819c46dcf917513")
    Call<RestaurantsStatus> restaurantList();


    @GET("~fbapp/whyinsidemenu/?action=get_filters&session_id=16bf3eed70ffef75f819c46dcf917513")
    Call<Filter> filtersList();

}
