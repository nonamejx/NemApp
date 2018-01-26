package com.nicest.nemapp.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Hai Huynh on 1/10/18.
 */

@Entity(tableName = "order_status")
public class OrderStatus {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
