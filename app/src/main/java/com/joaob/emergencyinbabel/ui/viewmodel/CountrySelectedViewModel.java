package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.repository.CountryLanguageRepository;

import java.util.ArrayList;

public class CountrySelectedViewModel extends AndroidViewModel {
    private CountryLanguageRepository repository;

    public CountrySelectedViewModel(Application app) {
        super(app);
        repository = CountryLanguageRepository.getInstance(app);
    }

    public ArrayList<Language> getLanguages(String countryID) {
        ArrayList<String> languageIDs = (ArrayList<String>) repository.getCountryLanguage(countryID).blockingFirst();
        ArrayList<Language> languages = new ArrayList<>();
        for(int i = 0; i < languageIDs.size(); i++) {
            languages.add((Language) repository.getSelectedLanguage(languageIDs.get(i)).blockingFirst());
        }
        return languages;
    }
}
