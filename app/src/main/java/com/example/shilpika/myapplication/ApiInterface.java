package com.example.shilpika.myapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("image")
    Call<Img_Pojo> uploadImage(@Field("image") String image);
}
