package com.joaob.emergencyinbabel.data.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.joaob.emergencyinbabel.data.domain.Country;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface CountryDAO {
    @Insert
    void insertCountry(Country country);

    @Query("SELECT * FROM country_table")
    Flowable<List<Country>> getCountries();
}
