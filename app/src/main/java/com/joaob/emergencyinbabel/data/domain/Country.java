package com.joaob.emergencyinbabel.data.domain;

import androidx.room.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "country_table")
public class Country {
    private Country name;
    private int iconID;

}
