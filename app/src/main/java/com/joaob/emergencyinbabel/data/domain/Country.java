package com.joaob.emergencyinbabel.data.domain;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "country_table")
public class Country {
    @PrimaryKey @NonNull
    private String name;
    private String iconID;

    public Country(@NonNull String name, String iconID) {
        this.name = name;
        this.iconID = iconID;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getIconID() {
        return iconID;
    }

    public void setIconID(String iconID) {
        this.iconID = iconID;
    }
}
