package com.joaob.emergencyinbabel.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Language;

import java.util.ArrayList;

public class LanguageListAdapter extends RecyclerView.Adapter<LanguageListViewHolder> {
    private ArrayList<Language> languages;

    public LanguageListAdapter(ArrayList<Language> languages) { this.languages = languages; }

    @NonNull
    @Override
    public LanguageListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_language, parent, false);
        return new LanguageListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageListViewHolder holder, int position) { holder.getName().setText(languages.get(position).getName()); }

    @Override
    public int getItemCount() { return languages.size(); }
}
