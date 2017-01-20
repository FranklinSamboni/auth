package com.example.frank.autenticacion.ApiClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Frank on 19/01/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "http://wmyserver.sytes.net:8080/mcd-ami-saa/webresources/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
