package com.nicest.nemapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nicest.nemapp.data.local.db.DbHelper;
import com.nicest.nemapp.utils.AppLogger;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((NemApp) getApplication()).getAppComponent().inject(this);

        AppLogger.d("Data", dbHelper);

        Log.d(MainActivity.class.getName(), dbHelper + "");
    }
}
