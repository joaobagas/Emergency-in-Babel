package com.joaob.emergencyinbabel.data.domain;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "language_table")
public class Language {
    @PrimaryKey @NonNull
    private String name;
    private String countryName;

    public Language(@NonNull String name, String countryName) {
        this.name = name;
        this.countryName = countryName;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
