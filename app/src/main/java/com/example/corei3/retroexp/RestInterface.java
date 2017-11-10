package com.example.corei3.retroexp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by SONY on 30-08-2017.
 */

public interface RestInterface {
    @POST("eventapi_iphone/latestEvents")
    Call<Example> getLatestEvents(@Body RequestMain jsondata);
}
