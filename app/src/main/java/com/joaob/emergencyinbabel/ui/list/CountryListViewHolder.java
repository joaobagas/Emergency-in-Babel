package com.joaob.emergencyinbabel.ui.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryListViewHolder extends RecyclerView.ViewHolder {
    private ImageView icon;
    private TextView name;

    public CountryListViewHolder(@NonNull View itemView) {
        super(itemView);
        icon = null;
        name = null;
    }

    public ImageView getIcon() { return icon; }
    public TextView getName() { return name; }
}
