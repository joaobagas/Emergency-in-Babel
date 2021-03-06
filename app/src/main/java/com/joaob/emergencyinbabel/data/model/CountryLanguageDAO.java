package com.joaob.emergencyinbabel.data.model;

import androidx.room.Dao;
import androidx.room.Query;

import com.joaob.emergencyinbabel.data.domain.CountryLanguage;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface CountryLanguageDAO {
    @Query("SELECT languageID FROM country_language_table WHERE countryID = :countryID;")
    Flowable<List<String>> getCountryLanguage(String countryID);
}
