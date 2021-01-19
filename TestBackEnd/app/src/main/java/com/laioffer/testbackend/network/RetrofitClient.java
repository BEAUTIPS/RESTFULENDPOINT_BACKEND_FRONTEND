package com.laioffer.testbackend.network;

import android.content.Context;

import com.ashokvarma.gander.GanderInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    // We now listen on our local host
    private static final String BASE_URL = "http://10.0.2.2:5000/";

    static Gson gson;

    public static Retrofit newInstance(Context context) {
        gson = new GsonBuilder()
                .setLenient() // add lenient
                .create();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new GanderInterceptor(context).showNotification(true))
                .build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                //For Json response that can be serialized to class object --> Example Model class TestResponse
                .addConverterFactory(GsonConverterFactory.create(gson))
                //For string response
                .addConverterFactory(ScalarsConverterFactory.create())
                .client(okHttpClient)
                .build();
    }


}