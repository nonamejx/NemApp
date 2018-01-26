package com.nicest.nemapp.di.component;

import com.nicest.nemapp.MainActivity;
import com.nicest.nemapp.NemApp;
import com.nicest.nemapp.di.module.AppModule;
import com.nicest.nemapp.di.module.RoomModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by wfm-vp on 1/11/18
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, RoomModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);

    void inject(NemApp nemApp);

}
