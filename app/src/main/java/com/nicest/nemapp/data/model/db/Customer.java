package com.nicest.nemapp.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Hai Huynh on 1/10/18.
 */

@Entity(tableName = "customer")
public class Customer {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "customer_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
