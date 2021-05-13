package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.repository.Repository;

import java.util.List;

import io.reactivex.Flowable;

public class CountriesViewModel extends AndroidViewModel {
    private Repository repository;

    public CountriesViewModel(Application app) {
        super(app);
        repository = Repository.getInstance(app);
    }

    public Flowable<List<Country>> getCountries() {
        return repository.getAllCountries();
    }
}