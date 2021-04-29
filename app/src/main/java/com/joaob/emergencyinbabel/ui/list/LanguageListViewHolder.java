package com.joaob.emergencyinbabel.ui.list;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LanguageListViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public LanguageListViewHolder(@NonNull View itemView) {
        super(itemView);
        name = null;
    }

    public TextView getName() { return name; }
}
