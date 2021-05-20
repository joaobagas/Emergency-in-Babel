package com.joaob.emergencyinbabel.data.api;

import com.joaob.emergencyinbabel.data.domain.Phrase;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhraseAPI {
    @GET("phrases")
    Call<List<Phrase>> getPhrases();
}
