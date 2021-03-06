package com.joaob.emergencyinbabel.data.domain;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "country_table")
public class Country {
    @PrimaryKey @NonNull
    private String countryID;
    @NonNull
    private String countryName;

    public Country(@NonNull String countryID, @NonNull String countryName) {
        this.countryID = countryID;
        this.countryName = countryName;
    }

    @NonNull
    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(@NonNull String countryID) {
        this.countryID = countryID;
    }

    @NonNull
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(@NonNull String countryName) {
        this.countryName = countryName;
    }
}
