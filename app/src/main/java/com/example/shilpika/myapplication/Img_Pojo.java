package com.example.shilpika.myapplication;

import android.util.Log;
import com.google.gson.annotations.SerializedName;
public class Img_Pojo {

    @SerializedName("image")
    private String Image;

    @SerializedName("result")
    private String Response;

    public String getResponse() {
        return Response;
    }
}

