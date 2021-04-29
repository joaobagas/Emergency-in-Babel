package com.joaob.emergencyinbabel.data.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "language_table")
public class Language {
    @PrimaryKey
    private String id;
    private String name;

    public Language(String id, String language) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String language) {
        this.name = language;
    }
}
