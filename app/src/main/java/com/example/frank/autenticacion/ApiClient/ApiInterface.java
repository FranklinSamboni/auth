package com.example.frank.autenticacion.ApiClient;

import com.example.frank.autenticacion.Model.auth;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Frank on 19/01/2017.
 */

public interface ApiInterface {
    @GET("Login/login")
    Call<auth> autenticateUser(@QueryMap Map<String, String> data);

}
