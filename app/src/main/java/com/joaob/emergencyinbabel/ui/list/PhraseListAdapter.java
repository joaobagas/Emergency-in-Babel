package com.joaob.emergencyinbabel.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Phrase;

import java.util.ArrayList;

public class PhraseListAdapter extends RecyclerView.Adapter<PhraseListViewHolder> {
    private ArrayList<Phrase> phrases;

    public PhraseListAdapter(ArrayList<Phrase> phrases) { this.phrases = phrases; }

    @NonNull
    @Override
    public PhraseListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_phrase, parent, false); // I need to change the fragment
        return new PhraseListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhraseListViewHolder holder, int position) {
        holder.getEnglishSentence().setText(phrases.get(position).getPhraseInEnglish());
        holder.getTranslatedSentence().setText(phrases.get(position).getTranslatedPhrase());
    }

    @Override
    public int getItemCount() { return phrases.size(); }
}
