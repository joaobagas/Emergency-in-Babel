package com.joaob.emergencyinbabel.data.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhraseAPI {
    @GET("phrases")
    Call<PhrasesResponse> getPhrases();
}
