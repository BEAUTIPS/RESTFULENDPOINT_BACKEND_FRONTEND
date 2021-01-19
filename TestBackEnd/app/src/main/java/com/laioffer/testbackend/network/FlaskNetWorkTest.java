package com.laioffer.testbackend.network;

import com.laioffer.testbackend.Model.TestPostModel;
import com.laioffer.testbackend.Model.TestResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface FlaskNetWorkTest {

    @GET("testJsonResponse")
    Call<TestResponse> getConnectionTest();

    @GET("testStringResponse")
    Call<String> getStringResponse();


    @Headers("Content-Type: application/json")
    @POST("testPostRequest")
    Call<String> postTest(@Body TestPostModel testpost);





}
