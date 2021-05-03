package com.joaob.emergencyinbabel.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.model.CountryDAO;
import com.joaob.emergencyinbabel.data.model.CountryDatabase;
import com.joaob.emergencyinbabel.data.model.LanguageDAO;
import com.joaob.emergencyinbabel.data.model.LanguageDatabase;

import java.util.List;

public class Repository {
    private static Repository instance;
    private CountryDAO countryDAO;
    private LanguageDAO languageDAO;
    private LiveData<List<Country>> countries;
    private LiveData<List<Language>> languages;

    private Repository(Application application) {
        CountryDatabase countryDatabase = CountryDatabase.getInstance(application);
        LanguageDatabase languageDatabase = LanguageDatabase.getInstance(application);
        countryDAO = countryDatabase.countryDAO();
        languageDAO = languageDatabase.languageDAO();
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
