package com.joaob.emergencyinbabel.data.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.joaob.emergencyinbabel.data.domain.Language;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface LanguageDAO {
    @Insert
    void insertLanguage(Language language);

    @Query("SELECT * FROM language_table;")
    Flowable<List<Language>> getLanguages();

    @Query("SELECT * FROM language_table WHERE languageID == :languageID;")
    Flowable<List<Language>> getLanguagesFromCountry(String languageID);
}
