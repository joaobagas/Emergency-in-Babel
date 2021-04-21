package com.joaob.emergencyinbabel.data.model;

import androidx.room.Entity;

@Entity(tableName = "phrase_table")
public class Phrase {
    private String languageId;
    private String phraseInEnglish;
    private String translatedPhrase;
}
