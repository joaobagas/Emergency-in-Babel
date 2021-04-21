package com.joaob.emergencyinbabel.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Emergency in Babel\n" +
                "It seems like you are in:");
    }

    public LiveData<String> getText() {
        return mText;
    }
}