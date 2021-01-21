package com.laioffer.testbackend.network;

import com.laioffer.testbackend.Model.TestPostModel;
import com.laioffer.testbackend.Model.TestResponse;
import com.laioffer.testbackend.Model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FlaskNetWorkTest {

    @GET("jsonresponses")
    Call<TestResponse> getConnectionTest();

    @GET("stringresponses")
    Call<String> getStringResponse();


    @Headers("Content-Type: application/json")
    @POST("testpostrequests")
    Call<String> postTest(@Body TestPostModel testpost);


    @Headers("Content-Type: application/json")
    @POST("users")
    Call<String> postUserInfo( @Body User user);



}
