package com.joaob.emergencyinbabel.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.ui.list.CountryListAdapter;
import com.joaob.emergencyinbabel.ui.viewmodel.CountriesViewModel;

import java.util.ArrayList;

public class CountriesFragment extends Fragment implements CountryListAdapter.OnListItemClickListener {
    private CountriesViewModel countriesViewModel;
    private RecyclerView countryRecyclerView;
    private CountryListAdapter countryListAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        countriesViewModel = new ViewModelProvider(this).get(CountriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_countries, container, false);

        ArrayList<Country> countries = (ArrayList<Country>) countriesViewModel.getCountries().blockingFirst();

        countryRecyclerView = (RecyclerView) root.findViewById(R.id.country_rv);
        countryRecyclerView.hasFixedSize();
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        countryListAdapter = new CountryListAdapter(countries, this);
        countryRecyclerView.setAdapter(countryListAdapter);

        return root;
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        ArrayList<Country> countries = (ArrayList<Country>) countriesViewModel.getCountries().blockingFirst();
        Intent intent = new Intent(this.getContext(), CountrySelectedActivity.class);
        intent.putExtra("country",countries.get(clickedItemIndex).getCountryID());
        startActivity(intent);
    }
}