package com.laioffer.testbackend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.laioffer.testbackend.Model.TestPostModel;
import com.laioffer.testbackend.Model.TestResponse;
import com.laioffer.testbackend.network.FlaskNetWorkTest;
import com.laioffer.testbackend.network.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //case where backend needs to return a Jsonobject (which will be  deserialized into model class)
        FlaskNetWorkTest api = RetrofitClient.newInstance(this).create(FlaskNetWorkTest.class);
        api.getConnectionTest().enqueue(new Callback<TestResponse>() {
            @Override
            public void onResponse(Call<TestResponse> call, Response<TestResponse> response) {
                          if (response.isSuccessful()) {
                                   Log.d("Successful", response.body().toString());
                          } else {
                                   Log.d("Failures", "Didn't receive message");
                          }
            }

            @Override
            public void onFailure(Call<TestResponse> call, Throwable t) {
                Log.d("Sth is wrong",t.toString());

            }
        });



        //case where backend needs to return a String front backend
        FlaskNetWorkTest apiString = RetrofitClient.newInstance(this).create(FlaskNetWorkTest.class);
        apiString.getStringResponse().enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    Log.d("Successful", response.body().toString());
                } else {
                    Log.d("Failures", "Didn't receive message");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("Sth is wrong",t.toString());

            }
        });



        //Test POST METHOD _Test Success
        //create Retrofit client
        FlaskNetWorkTest apiPost = RetrofitClient.newInstance(this).create(FlaskNetWorkTest.class);
        //create testPost class
        TestPostModel testPost = new TestPostModel("Something", "Sth else");
        //Get our response
        Call<String> callResult = apiPost.postTest(testPost);

        callResult.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    Log.d("Successful", response.body().toString());
                } else {
                    Log.d("Failures", "Didn't receive message");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("Sth is wrong",t.toString());

            }
        });

    }
}