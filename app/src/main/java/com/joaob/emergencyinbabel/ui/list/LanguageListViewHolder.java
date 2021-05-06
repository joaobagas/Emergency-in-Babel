package com.joaob.emergencyinbabel.ui.list;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;

public class LanguageListViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public LanguageListViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.languageName);
    }

    public TextView getName() { return name; }
}
