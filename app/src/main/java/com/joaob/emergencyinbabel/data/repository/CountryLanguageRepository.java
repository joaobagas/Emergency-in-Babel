package com.joaob.emergencyinbabel.data.repository;

import android.app.Application;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.model.CountryDAO;
import com.joaob.emergencyinbabel.data.model.CountryLanguageDAO;
import com.joaob.emergencyinbabel.data.model.LanguageDAO;
import com.joaob.emergencyinbabel.data.model.LocalApplicationDatabase;

import java.util.List;

import io.reactivex.Flowable;

public class CountryLanguageRepository {
    private static CountryLanguageRepository instance;
    private CountryDAO countryDAO;
    private CountryLanguageDAO countryLanguageDAO;
    private LanguageDAO languageDAO;

    private CountryLanguageRepository(Application application) {
        LocalApplicationDatabase localApplicationDatabase = LocalApplicationDatabase.getInstance(application);
        countryDAO = localApplicationDatabase.countryDAO();
        countryLanguageDAO = localApplicationDatabase.countryLanguageDAO();
        languageDAO = localApplicationDatabase.languageDAO();
    }
    
    public static synchronized CountryLanguageRepository getInstance(Application application){
        if(instance == null)
            instance = new CountryLanguageRepository(application);
        return instance;
    }

    public Flowable<List<Country>> getAllCountries() { return countryDAO.getCountries(); }
    public Flowable<List<String>> getCountryLanguage(String countryID) { return countryLanguageDAO.getCountryLanguage(countryID); }
    public Flowable<List<Language>> getAllLanguages() { return languageDAO.getLanguages(); }
    public Flowable<Language> getSelectedLanguage(String languageID) { return languageDAO.getSelectedLanguage(languageID); }
}
