package com.joaob.emergencyinbabel.data.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.joaob.emergencyinbabel.data.domain.Country;

@Database(entities = {Country.class}, version = 1)
public abstract class CountryDatabase extends RoomDatabase {
    private static CountryDatabase instance;
    public abstract CountryDAO countryDAO();

    public static synchronized CountryDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    CountryDatabase.class, "country_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
