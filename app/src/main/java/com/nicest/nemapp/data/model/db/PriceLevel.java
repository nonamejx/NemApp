package com.nicest.nemapp.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Hai Huynh on 1/10/18.
 */

@Entity(tableName = "price_level",
        foreignKeys = @ForeignKey(entity = SaleType.class,
                parentColumns = "id", childColumns = "sale_type_id"))
public class PriceLevel {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "sale_type_id")
    private Long saleTypeId;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "value")
    private Double value;

    public Long getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(Long saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
