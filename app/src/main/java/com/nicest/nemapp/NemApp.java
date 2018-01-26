package com.nicest.nemapp;

import android.app.Application;

import com.nicest.nemapp.di.component.AppComponent;
import com.nicest.nemapp.di.component.DaggerAppComponent;
import com.nicest.nemapp.di.module.AppModule;
import com.nicest.nemapp.di.module.RoomModule;
import com.nicest.nemapp.utils.AppLogger;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by wfm-vp on 1/18/18
 */

public class NemApp extends Application {

    private AppComponent appComponent;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    @Override
    public void onCreate() {
        super.onCreate();

        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .roomModule(new RoomModule(this))
                .build();

        getAppComponent().inject(this);

        CalligraphyConfig.initDefault(mCalligraphyConfig);

        AppLogger.init();
    }

    public AppComponent getAppComponent() {
        return this.appComponent;
    }
}
