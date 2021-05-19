package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.joaob.emergencyinbabel.data.domain.Phrase;
import com.joaob.emergencyinbabel.data.repository.PhraseRepository;

import java.io.IOException;
import java.util.ArrayList;

public class PhraseViewModel extends AndroidViewModel {
    private PhraseRepository repository;

    public PhraseViewModel(Application app) {
        super(app);
        repository = PhraseRepository.getInstance(app);
    }

    public ArrayList<Phrase> getPhrases(String languageID) {
        return repository.getPhrases(languageID);
    }
}
