package com.joaob.emergencyinbabel.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Country;

import java.util.ArrayList;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListViewHolder> {
    private ArrayList<Country> countries;

    public CountryListAdapter(ArrayList<Country> countries) { this.countries = countries; }

    @NonNull
    @Override
    public CountryListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_country, parent, false);
        return new CountryListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryListViewHolder holder, int position) {
        //holder.getIcon().setImageResource(countries.get(position).getIconID());
        holder.getName().setText(countries.get(position).getCountryName());
    }

    @Override
    public int getItemCount() { return countries.size(); }
}
