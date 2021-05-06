package com.joaob.emergencyinbabel.data.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.joaob.emergencyinbabel.data.domain.Language;

@Database(entities = {Language.class}, version = 1, exportSchema = false)
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
