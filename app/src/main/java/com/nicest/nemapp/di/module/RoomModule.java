package com.nicest.nemapp.di.module;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.nicest.nemapp.data.local.db.AppDatabase;
import com.nicest.nemapp.data.local.db.AppDbHelper;
import com.nicest.nemapp.data.local.db.DbHelper;
import com.nicest.nemapp.di.DatabaseInfo;
import com.nicest.nemapp.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wfm-vp on 1/18/18
 */

@Module
public class RoomModule {

    private AppDatabase appDatabase;

    public RoomModule(Application application) {
        appDatabase = Room.databaseBuilder(application, AppDatabase.class, AppConstants.DB_NAME).fallbackToDestructiveMigration().build();
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase() {
        return appDatabase;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

}
