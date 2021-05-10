package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joaob.emergencyinbabel.data.repository.Repository;

public class HomeViewModel extends AndroidViewModel {
    private MutableLiveData<String> mText;
    private Repository repository;

    public HomeViewModel(Application app) {
        super(app);
        repository = Repository.getInstance(app);
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Emergency in Babel\n" +
                "It seems like you are in:");
    }

    public LiveData<String> getText() {
        return mText;
    }
}