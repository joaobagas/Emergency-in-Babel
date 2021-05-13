package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.joaob.emergencyinbabel.data.repository.Repository;

public class PhraseViewModel extends AndroidViewModel {
    private Repository repository;

    public PhraseViewModel(Application app) {
        super(app);
        repository = Repository.getInstance(app);
    }
}
