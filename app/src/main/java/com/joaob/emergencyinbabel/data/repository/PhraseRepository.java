package com.joaob.emergencyinbabel.data.repository;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.joaob.emergencyinbabel.data.api.PhraseAPI;
import com.joaob.emergencyinbabel.data.api.PhrasesResponse;
import com.joaob.emergencyinbabel.data.api.ServiceGenerator;
import com.joaob.emergencyinbabel.data.domain.Phrase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class PhraseRepository {
    private static PhraseRepository instance;
    private PhraseAPI phraseAPI;
    private ArrayList<Phrase> phrases;

    public PhraseRepository() {
        phraseAPI = ServiceGenerator.getPhraseApi();
    }

    public static synchronized PhraseRepository getInstance(Application application) {
        if(instance == null)
            instance = new PhraseRepository();
        return instance;
    }

    //public ArrayList<Phrase> getPhrases(String languageID) { return phrases; }

    public ArrayList<Phrase> getPhrases(String languageID) {
        MutableLiveData<ArrayList<Phrase>> phrasesResponse = new MutableLiveData<>();
        Call<PhrasesResponse> call = phraseAPI.getPhrases();
        call.enqueue(new Callback<PhrasesResponse>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(Call<PhrasesResponse> call, Response<PhrasesResponse> response) {
                if (response.isSuccessful()) {
                    phrasesResponse.setValue(response.body().getPhrases());
                }
            }
            @EverythingIsNonNull
            @Override
            public void onFailure(Call<PhrasesResponse> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(");
            }
        });

        //while (phrasesResponse.getValue() == null) {}

        for (int i = 0; i < phrasesResponse.getValue().size(); i++) {
            if (phrasesResponse.getValue().get(i).equals(languageID))
                phrases.add(phrasesResponse.getValue().get(i));
        }

        return phrases;
    }
}
