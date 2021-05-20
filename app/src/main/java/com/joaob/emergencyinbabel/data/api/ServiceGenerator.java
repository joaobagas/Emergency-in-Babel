package com.joaob.emergencyinbabel.data.api;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    public static String BASE_URL ="https://2a9f901c-d6a6-477b-a797-7b06bc42c4be.mock.pstmn.io/";
    private static Retrofit retrofit;
    public static Retrofit getClient() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
