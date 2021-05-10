package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.repository.Repository;

import java.util.List;

public class CountriesViewModel extends AndroidViewModel {
    private Repository repository;
    private LiveData<List<Country>> countries;

    public CountriesViewModel(Application app) {
        super(app);
        repository = Repository.getInstance(app);
        countries = repository.getAllCountries();
    }

    public LiveData<List<Country>> getCountries() {
        return countries;
    }
}