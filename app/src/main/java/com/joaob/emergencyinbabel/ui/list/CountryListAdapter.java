package com.joaob.emergencyinbabel.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Country;

import java.util.ArrayList;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryListViewHolder> {
    private ArrayList<Country> countries;
    private final OnListItemClickListener mOnListItemClickListener;


    public CountryListAdapter(ArrayList<Country> countries, OnListItemClickListener listener) {
        this.countries = countries;
        this.mOnListItemClickListener = listener;
    }

    @NonNull
    @Override
    public CountryListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_country, parent, false);
        return new CountryListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryListViewHolder holder, int position) {
        holder.getIcon().setImageResource(getDrawable(countries.get(position).getCountryID()));
        holder.getName().setText(countries.get(position).getCountryName());
    }

    @Override
    public int getItemCount() { return countries.size(); }

    public interface OnListItemClickListener { void onListItemClick(int clickedItemIndex); }

    public class CountryListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView icon;
        private TextView name;

        public CountryListViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.countryIcon);
            name = itemView.findViewById(R.id.countryName);
            itemView.setOnClickListener(this);
        }

        public ImageView getIcon() { return icon; }
        public TextView getName() { return name; }

        @Override
        public void onClick(View v) {
            mOnListItemClickListener.onListItemClick(getAdapterPosition());
        }
    }

    private int getDrawable(String countryID) {
        switch (countryID) {
            case "au":
                return R.drawable.flag_austria;
            case "be":
                return R.drawable.flag_belgium;
            case "bu":
                return R.drawable.flag_bulgaria;
            case "cr":
                return R.drawable.flag_croatia;
            case "cy":
                return R.drawable.flag_cyprus;
            case "cz":
                return R.drawable.flag_czechia;
            case "dk":
                return R.drawable.flag_denmark;
            case "es":
                return R.drawable.flag_estonia;
            case "fi":
                return R.drawable.flag_finland;
            case "fr":
                return R.drawable.flag_france;
            case "ge":
                return R.drawable.flag_germany;
            case "gr":
                return R.drawable.flag_greece;
            case "hu":
                return R.drawable.flag_hungary;
            case "ir":
                return R.drawable.flag_ireland;
            case "it":
                return R.drawable.flag_italy;
            case "la":
                return R.drawable.flag_latvia;
            case "li":
                return R.drawable.flag_lithuania;
            case "lu":
                return R.drawable.flag_luxembourg;
            case "ma":
                return R.drawable.flag_malta;
            case "ne":
                return R.drawable.flag_netherlands;
            case "po":
                return R.drawable.flag_poland;
            case "pt":
                return R.drawable.flag_portugal;
            case "ro":
                return R.drawable.flag_romania;
            case "sk":
                return R.drawable.flag_slovakia;
            case "sl":
                return R.drawable.flag_slovenia;
            case "sp":
                return R.drawable.flag_spain;
            case "sw":
                return R.drawable.flag_sweden;
            default:
                return R.drawable.flag_denmark;
        }
    }
}
