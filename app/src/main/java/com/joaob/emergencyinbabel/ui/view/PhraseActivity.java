package com.joaob.emergencyinbabel.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.data.domain.Phrase;
import com.joaob.emergencyinbabel.ui.list.LanguageListAdapter;
import com.joaob.emergencyinbabel.ui.list.PhraseListAdapter;
import com.joaob.emergencyinbabel.ui.viewmodel.LanguagesViewModel;
import com.joaob.emergencyinbabel.ui.viewmodel.PhraseViewModel;

import java.util.ArrayList;
import java.util.List;

public class PhraseActivity extends AppCompatActivity {
    private PhraseViewModel phraseViewModel;
    private RecyclerView phraseRecyclerView;
    private PhraseListAdapter phraseListAdapter;
    private List<Phrase> phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        phraseViewModel = new ViewModelProvider(this).get(PhraseViewModel.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        Bundle bundle = new Bundle();
        String languageID = (String) bundle.get("languageID");

        phraseRecyclerView = (RecyclerView) findViewById(R.id.phrase_rv);
        phraseRecyclerView.hasFixedSize();
        phraseRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        phraseViewModel.setRecyclerView(phraseRecyclerView, phraseListAdapter);
        phraseViewModel.updatePhrases(languageID);
    }
}