package com.joaob.emergencyinbabel.ui.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.data.domain.Phrase;
import com.joaob.emergencyinbabel.data.repository.PhraseRepository;
import com.joaob.emergencyinbabel.ui.list.PhraseListAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhraseViewModel extends AndroidViewModel {
    private PhraseRepository repository;

    public PhraseViewModel(Application app) {
        super(app);
        repository = PhraseRepository.getInstance(app);
    }

    public void setRecyclerView (RecyclerView phraseRecyclerView, PhraseListAdapter phraseListAdapter) {
        repository.setRecyclerView (phraseRecyclerView, phraseListAdapter);
    }

    public MutableLiveData<List<Phrase>> getPhraseListObserver(String languageID) {
        return repository.getPhraseListObserver();
    }

    public void updatePhrases() {
        repository.updatePhrases("bu");
    }


}
