package com.joaob.emergencyinbabel.data.model;

import androidx.room.Entity;
import java.util.ArrayList;

@Entity(tableName = "country_table")
public class Country {
    private Country name;
    private ArrayList<Language> languages;
}
