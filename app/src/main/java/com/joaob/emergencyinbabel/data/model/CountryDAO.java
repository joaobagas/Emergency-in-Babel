package com.joaob.emergencyinbabel.data.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.joaob.emergencyinbabel.data.domain.Country;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface CountryDAO {
    @Insert
    void insertCountry(Country country);

    @Query("SELECT * FROM country_table")
    LiveData<List<Country>> getCountries();
}
