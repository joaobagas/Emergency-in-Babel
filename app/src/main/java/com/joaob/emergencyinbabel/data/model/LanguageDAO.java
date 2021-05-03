package com.joaob.emergencyinbabel.data.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.joaob.emergencyinbabel.data.domain.Language;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface LanguageDAO {
    @Query("SELECT * FROM language_table")
    LiveData<List<Language>> getLanguages();

    @Query("SELECT * FROM language_table WHERE countryName == :countryName")
    LiveData<List<Language>> getLanguagesFromCountry(String countryName);
}
