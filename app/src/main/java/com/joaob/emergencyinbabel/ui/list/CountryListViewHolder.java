package com.joaob.emergencyinbabel.ui.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;

public class CountryListViewHolder extends RecyclerView.ViewHolder {
    private ImageView icon;
    private TextView name;

    public CountryListViewHolder(@NonNull View itemView) {
        super(itemView);
        icon = itemView.findViewById(R.id.countryIcon);
        name = itemView.findViewById(R.id.countryName);
    }

    public ImageView getIcon() { return icon; }
    public TextView getName() { return name; }
}
