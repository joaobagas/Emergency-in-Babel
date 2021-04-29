package com.joaob.emergencyinbabel.data.domain;

import androidx.room.Entity;

@Entity(tableName = "phrase_table")
public class Phrase {
    private String languageID;
    private String phraseInEnglish;
    private String translatedPhrase;

    public Phrase(String languageID, String phraseInEnglish, String translatedPhrase) {
        this.languageID = languageID;
        this.phraseInEnglish = phraseInEnglish;
        this.translatedPhrase = translatedPhrase;
    }

    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(String languageID) {
        this.languageID = languageID;
    }

    public String getPhraseInEnglish() {
        return phraseInEnglish;
    }

    public void setPhraseInEnglish(String phraseInEnglish) {
        this.phraseInEnglish = phraseInEnglish;
    }

    public String getTranslatedPhrase() {
        return translatedPhrase;
    }

    public void setTranslatedPhrase(String translatedPhrase) {
        this.translatedPhrase = translatedPhrase;
    }
}
