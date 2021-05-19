package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.joaob.emergencyinbabel.data.repository.CountryLanguageRepository;

public class HomeViewModel extends AndroidViewModel {
    private CountryLanguageRepository repository;

    public HomeViewModel(Application app) {
        super(app);
        repository = CountryLanguageRepository.getInstance(app);
    }
}