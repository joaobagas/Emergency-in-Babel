package com.joaob.emergencyinbabel.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.ui.list.LanguageListAdapter;
import com.joaob.emergencyinbabel.ui.viewmodel.CountriesViewModel;
import com.joaob.emergencyinbabel.ui.viewmodel.CountrySelectedViewModel;

import java.util.ArrayList;

public class CountrySelectedActivity extends AppCompatActivity implements LanguageListAdapter.OnListItemClickListener{
    private CountrySelectedViewModel countrySelectedViewModel;
    private RecyclerView languageRecyclerView;
    private LanguageListAdapter languageListAdapter;
    private ArrayList<Language> languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_selected);
        countrySelectedViewModel = new ViewModelProvider(this).get(CountrySelectedViewModel.class);

        Bundle bundle = getIntent().getExtras();
        String countryID = bundle.getString("countryID");

        languages = countrySelectedViewModel.getLanguages(countryID);

        languageRecyclerView = (RecyclerView) findViewById(R.id.country_selected_rv);
        languageRecyclerView.hasFixedSize();
        languageRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        languageListAdapter = new LanguageListAdapter(languages, this);
        languageRecyclerView.setAdapter(languageListAdapter);
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {

    }
}