package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.repository.Repository;

import java.util.List;

public class LanguagesViewModel extends AndroidViewModel {
    private Repository repository;
    private LiveData<List<Language>> languages;

    public LanguagesViewModel(Application app) {
        super(app);
        repository = Repository.getInstance(app);
        languages = repository.getAllLanguages();
    }

    public LiveData<List<Language>> getLanguages() {
        return languages;
    }
}