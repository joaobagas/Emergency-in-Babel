package com.joaob.emergencyinbabel.data.domain;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "language_table")
public class Language {
    @PrimaryKey @NonNull
    private String languageID;
    @NonNull
    private String languageName;

    public Language(@NonNull String languageID, @NonNull String languageName) {
        this.languageID = languageID;
        this.languageName = languageName;
    }

    @NonNull
    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(@NonNull String languageID) {
        this.languageID = languageID;
    }

    @NonNull
    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(@NonNull String languageName) {
        this.languageName = languageName;
    }
}
