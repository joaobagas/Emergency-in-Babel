package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.repository.CountryLanguageRepository;

import java.util.List;

import io.reactivex.Flowable;

public class LanguagesViewModel extends AndroidViewModel {
    private CountryLanguageRepository repository;

    public LanguagesViewModel(Application app) {
        super(app);
        repository = CountryLanguageRepository.getInstance(app);
    }

    public Flowable<List<Language>> getLanguages() {
        return repository.getAllLanguages();
    }
}