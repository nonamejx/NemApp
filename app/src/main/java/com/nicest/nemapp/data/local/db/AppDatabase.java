package com.nicest.nemapp.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.nicest.nemapp.data.local.db.dao.CustomerDao;
import com.nicest.nemapp.data.model.db.Customer;

/**
 * Created by wfm-vp on 1/11/18
 */

@Database(entities = {Customer.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CustomerDao customerDao();

}
