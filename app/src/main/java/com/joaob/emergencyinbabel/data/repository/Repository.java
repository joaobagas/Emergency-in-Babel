package com.joaob.emergencyinbabel.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.joaob.emergencyinbabel.data.api.TranslationAPI;
import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.model.CountryDAO;
import com.joaob.emergencyinbabel.data.model.LanguageDAO;
import com.joaob.emergencyinbabel.data.model.LocalApplicationDatabase;

import java.util.List;

public class Repository {
    private static Repository instance;
    private CountryDAO countryDAO;
    private LanguageDAO languageDAO;
    private TranslationAPI translationAPI;
    private LiveData<List<Country>> countries;
    private LiveData<List<Language>> languages;
    private LocalApplicationDatabase localApplicationDatabase;

    private Repository(Application application) {
        LocalApplicationDatabase localApplicationDatabase = LocalApplicationDatabase.getInstance(application);
        countryDAO = localApplicationDatabase.countryDAO();
        languageDAO = localApplicationDatabase.languageDAO();
        countries = countryDAO.getCountries();
        languages = languageDAO.getLanguages();
    }

    public static synchronized Repository getInstance(Application application){
        if(instance == null)
            instance = new Repository(application);
        return instance;
    }

    public LiveData<List<Country>> getAllCountries() { return countries; }
    public LiveData<List<Language>> getAllLanguages() { return languages; }
}
