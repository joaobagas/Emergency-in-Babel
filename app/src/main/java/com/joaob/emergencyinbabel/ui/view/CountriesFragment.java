package com.joaob.emergencyinbabel.ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.ui.list.CountryListAdapter;
import com.joaob.emergencyinbabel.ui.viewmodel.CountriesViewModel;

import java.util.ArrayList;

public class CountriesFragment extends Fragment {
    private CountriesViewModel countriesViewModel;
    private RecyclerView countryRecyclerView;
    private CountryListAdapter countryListAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        countriesViewModel = new ViewModelProvider(this).get(CountriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_countries, container, false);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Portugal", R.drawable.flag_portugal));
        countries.add(new Country("Denmark", R.drawable.flag_denmark));
        countries.add(new Country("France", R.drawable.flag_france));
        countries.add(new Country("Portugal", R.drawable.flag_portugal));
        countries.add(new Country("Denmark", R.drawable.flag_denmark));
        countries.add(new Country("France", R.drawable.flag_france));
        countries.add(new Country("Portugal", R.drawable.flag_portugal));
        countries.add(new Country("Denmark", R.drawable.flag_denmark));
        countries.add(new Country("France", R.drawable.flag_france));
        countries.add(new Country("Portugal", R.drawable.flag_portugal));
        countries.add(new Country("Denmark", R.drawable.flag_denmark));
        countries.add(new Country("France", R.drawable.flag_france));

        countryRecyclerView = (RecyclerView) root.findViewById(R.id.country_rv);
        countryRecyclerView.hasFixedSize();
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        countryListAdapter = new CountryListAdapter(countries);
        countryRecyclerView.setAdapter(countryListAdapter);

        return root;
    }
}