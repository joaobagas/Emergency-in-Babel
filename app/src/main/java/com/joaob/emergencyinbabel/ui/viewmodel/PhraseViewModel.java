package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.joaob.emergencyinbabel.data.domain.Phrase;
import com.joaob.emergencyinbabel.data.repository.PhraseRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhraseViewModel extends AndroidViewModel {
    private PhraseRepository repository;

    public PhraseViewModel(Application app) {
        super(app);
        repository = PhraseRepository.getInstance(app);
    }

    public LiveData<List<Phrase>> getPhrases(String languageID) {
        return repository.getPhrases(languageID);
    }

    public void updatePhraseList() {
        repository.updatePhrases("bu");
    }
}
