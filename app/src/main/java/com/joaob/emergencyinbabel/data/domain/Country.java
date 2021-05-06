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
    private int iconID;

    public Country(@NonNull String name, int iconID) {
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

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }
}
