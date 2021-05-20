package com.joaob.emergencyinbabel.data.repository;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.joaob.emergencyinbabel.data.api.PhraseAPI;
import com.joaob.emergencyinbabel.data.api.ServiceGenerator;
import com.joaob.emergencyinbabel.data.domain.Phrase;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class PhraseRepository {
    private static PhraseRepository instance;
    private PhraseAPI phraseAPI;
    private MutableLiveData<List<Phrase>> phrases;

    private PhraseRepository() {
        phraseAPI = ServiceGenerator.getClient().create(PhraseAPI.class);
        phrases = new MutableLiveData<>();
    }

    public static synchronized PhraseRepository getInstance(Application application) {
        if(instance == null)
            instance = new PhraseRepository();
        return instance;
    }

    public LiveData<List<Phrase>> getPhrases(String languageID) {
        return phrases;
    }

    public void updatePhrases(String languageID) {
        Call<List<Phrase>> call = phraseAPI.getPhrases();
        call.enqueue(new Callback<List<Phrase>>() {
            @Override
            public void onResponse(Call<List<Phrase>> call, Response<List<Phrase>> response) {
                if (response.code() == 200) {
                    phrases.postValue(response.body());
                } else {
                    Log.i("Retrofit", "Something went wrong :(");
                }
            }

            @Override
            public void onFailure(Call<List<Phrase>> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(");
            }
        });
    }
}
