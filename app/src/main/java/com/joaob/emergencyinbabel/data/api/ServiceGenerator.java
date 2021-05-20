package com.joaob.emergencyinbabel.data.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static PhraseAPI phraseAPI;

    public static PhraseAPI getPhraseApi() {
        if (phraseAPI == null) {
            phraseAPI = new Retrofit.Builder()
                    .baseUrl("https://2a9f901c-d6a6-477b-a797-7b06bc42c4be.mock.pstmn.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(PhraseAPI.class);
        }
        return phraseAPI;
    }
}
