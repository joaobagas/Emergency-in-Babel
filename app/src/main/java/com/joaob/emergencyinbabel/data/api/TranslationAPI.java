package com.joaob.emergencyinbabel.data.api;

import com.joaob.emergencyinbabel.data.domain.Phrase;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TranslationAPI {
    @GET("")
    Call<Phrase> getPhrase();
}
