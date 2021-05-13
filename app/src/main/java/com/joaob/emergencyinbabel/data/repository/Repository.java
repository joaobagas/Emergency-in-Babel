package com.joaob.emergencyinbabel.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.joaob.emergencyinbabel.data.api.TranslationAPI;
import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.CountryLanguage;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.model.CountryDAO;
import com.joaob.emergencyinbabel.data.model.CountryLanguageDAO;
import com.joaob.emergencyinbabel.data.model.LanguageDAO;
import com.joaob.emergencyinbabel.data.model.LocalApplicationDatabase;

import java.util.List;

import io.reactivex.Flowable;

public class Repository {
    private static Repository instance;
    private CountryDAO countryDAO;
    private CountryLanguageDAO countryLanguageDAO;
    private LanguageDAO languageDAO;
    private TranslationAPI translationAPI;
    private MutableLiveData<Boolean> isLoading = new MutableLiveData<>();

    private Repository(Application application) {
        LocalApplicationDatabase localApplicationDatabase = LocalApplicationDatabase.getInstance(application);
        countryDAO = localApplicationDatabase.countryDAO();
        countryLanguageDAO = localApplicationDatabase.countryLanguageDAO();
        languageDAO = localApplicationDatabase.languageDAO();
    }
    
    public static synchronized Repository getInstance(Application application){
        if(instance == null)
            instance = new Repository(application);
        return instance;
    }

    public Flowable<List<Country>> getAllCountries() { return countryDAO.getCountries(); }
    public Flowable<List<String>> getCountryLanguage(String countryID) { return countryLanguageDAO.getCountryLanguage(countryID); }
    public Flowable<List<Language>> getAllLanguages() { return languageDAO.getLanguages(); }
    public Flowable<Language> getSelectedLanguage(String languageID) { return languageDAO.getSelectedLanguage(languageID); }
}
