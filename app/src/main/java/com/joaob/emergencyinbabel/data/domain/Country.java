package com.joaob.emergencyinbabel.data.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "country_table")
public class Country {
    @PrimaryKey
    private String name;
    private int iconID;

    public Country(int iconID, String name) {
        this.iconID = iconID;
        this.name = name;
    }

    public int getIconID() { return iconID; }
    public void setIconID(int iconID) { this.iconID = iconID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
