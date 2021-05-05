package com.joaob.emergencyinbabel.ui.view;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.ui.list.CountryListAdapter;
import com.joaob.emergencyinbabel.ui.list.LanguageListAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView countryRecyclerView;
    private CountryListAdapter countryListAdapter;
    private RecyclerView languageRecyclerView;
    private LanguageListAdapter languageListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Country> countries = new ArrayList<>();
        ArrayList<Language> languages = new ArrayList<>();

        countries.add(new Country("Portugal", "flag_portugal"));
        languages.add(new Language("Portuguese", "Portugal"));

        countryRecyclerView = findViewById(R.id.country_rv);
        countryRecyclerView.hasFixedSize();
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        countryListAdapter = new CountryListAdapter(countries);
        countryRecyclerView.setAdapter(countryListAdapter);

        languageRecyclerView = findViewById(R.id.country_rv);
        languageRecyclerView.hasFixedSize();
        languageRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        languageListAdapter = new LanguageListAdapter(languages);
        languageRecyclerView.setAdapter(languageListAdapter);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }
}