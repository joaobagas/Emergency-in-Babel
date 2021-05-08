package com.joaob.emergencyinbabel.data.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.Language;

@Database(entities = {Country.class, Language.class}, version = 1, exportSchema = false)
public abstract class LocalApplicationDatabase extends RoomDatabase {
    private static LocalApplicationDatabase instance;
    public abstract CountryDAO countryDAO();
    public abstract LanguageDAO languageDAO();


    public static synchronized LocalApplicationDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalApplicationDatabase.class, "local_application_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
