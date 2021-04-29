package com.joaob.emergencyinbabel.ui.list;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhraseListViewHolder extends RecyclerView.ViewHolder {
    private TextView englishPhrase;
    private TextView translatedPhrase;

    public PhraseListViewHolder(@NonNull View itemView) {
        super(itemView);
        englishPhrase = null;
        translatedPhrase = null;
    }

    public TextView getEnglishSentence() { return englishPhrase; }
    public TextView getTranslatedSentence() { return translatedPhrase; }
}
