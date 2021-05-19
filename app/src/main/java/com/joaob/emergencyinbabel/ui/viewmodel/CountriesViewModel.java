package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.repository.CountryLanguageRepository;

import java.util.List;

import io.reactivex.Flowable;

public class CountriesViewModel extends AndroidViewModel {
    private CountryLanguageRepository repository;

    public CountriesViewModel(Application app) {
        super(app);
        repository = CountryLanguageRepository.getInstance(app);
    }

    public Flowable<List<Country>> getCountries() {
        return repository.getAllCountries();
    }
}