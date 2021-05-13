package com.joaob.emergencyinbabel.data.domain;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"countryID", "languageID"}, tableName = "country_language_table")
public class CountryLanguage {
    @NonNull
    private String countryID;
    @NonNull
    private String languageID;

    public CountryLanguage(@NonNull String countryID, @NonNull String languageID) {
        this.countryID = countryID;
        this.languageID = languageID;
    }

    @NonNull
    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(@NonNull String countryID) {
        this.countryID = countryID;
    }

    @NonNull
    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(@NonNull String languageID) {
        this.languageID = languageID;
    }
}
