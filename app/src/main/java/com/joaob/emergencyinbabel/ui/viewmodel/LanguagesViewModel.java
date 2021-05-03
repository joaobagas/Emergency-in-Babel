package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joaob.emergencyinbabel.data.repository.Repository;

public class LanguagesViewModel extends AndroidViewModel {
    private Repository repository;

    public LanguagesViewModel(Application app) {
        super(app);
        repository = Repository.getInstance(app);
    }

    public LiveData<String> getText() { return null; }
}