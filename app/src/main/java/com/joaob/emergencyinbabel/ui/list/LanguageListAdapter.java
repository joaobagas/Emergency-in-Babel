package com.joaob.emergencyinbabel.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Language;

import java.util.ArrayList;

public class LanguageListAdapter extends RecyclerView.Adapter<LanguageListAdapter.LanguageListViewHolder> {
    private ArrayList<Language> languages;
    private final OnListItemClickListener mOnListItemClickListener;

    public LanguageListAdapter(ArrayList<Language> languages, OnListItemClickListener listener) {
        this.languages = languages;
        this.mOnListItemClickListener = listener;
    }

    @NonNull
    @Override
    public LanguageListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_language, parent, false);
        return new LanguageListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageListViewHolder holder, int position) { holder.getName().setText(languages.get(position).getLanguageName()); }

    @Override
    public int getItemCount() { return languages.size(); }

    public interface OnListItemClickListener { void onListItemClick(int clickedItemIndex);}

    public class LanguageListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView name;

        public LanguageListViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.languageName);
            itemView.setOnClickListener(this);
        }

        public TextView getName() { return name; }

        @Override
        public void onClick(View v) {
            mOnListItemClickListener.onListItemClick(getAdapterPosition());
        }
    }
}
