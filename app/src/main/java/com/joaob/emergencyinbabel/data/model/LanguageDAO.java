package com.joaob.emergencyinbabel.data.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.joaob.emergencyinbabel.data.domain.Language;

import java.util.List;

@Dao
public interface LanguageDAO {
    @Insert
    void insertLanguage(Language language);

    @Query("SELECT * FROM language_table")
    LiveData<List<Language>> getLanguages();

    @Query("SELECT * FROM language_table WHERE languageID == :languageID")
    LiveData<List<Language>> getLanguagesFromCountry(String languageID);
}
