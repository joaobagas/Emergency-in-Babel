package com.joaob.emergencyinbabel.data.model;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.joaob.emergencyinbabel.data.domain.Country;
import com.joaob.emergencyinbabel.data.domain.CountryLanguage;
import com.joaob.emergencyinbabel.data.domain.Language;

@Database(entities = {Country.class, CountryLanguage.class, Language.class}, version = 1, exportSchema = false)
public abstract class LocalApplicationDatabase extends RoomDatabase {
    private static LocalApplicationDatabase instance;
    public abstract CountryDAO countryDAO();
    public abstract CountryLanguageDAO countryLanguageDAO();
    public abstract LanguageDAO languageDAO();


    public static synchronized LocalApplicationDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalApplicationDatabase.class, "local_application_database.db")
                    .createFromAsset("local_application_database.db.sql").fallbackToDestructiveMigration()
                    .build();
            /*
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalApplicationDatabase.class, "local_application_database.db")
                    .fallbackToDestructiveMigration().addCallback(roomCallBack)
                    .build();*/

        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallBack = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };
}
