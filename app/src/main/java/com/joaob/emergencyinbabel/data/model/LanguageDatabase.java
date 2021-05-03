package com.joaob.emergencyinbabel.data.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.joaob.emergencyinbabel.data.domain.Country;

@Database(entities = {Country.class}, version = 1)
public abstract class LanguageDatabase extends RoomDatabase {
    private static LanguageDatabase instance;
    public abstract LanguageDAO languageDAO();

    public static synchronized LanguageDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LanguageDatabase.class, "language_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
