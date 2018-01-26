package com.nicest.nemapp.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Hai Huynh on 1/10/18.
 */

@Entity(tableName = "cost",
        foreignKeys = @ForeignKey(entity = SaleType.class,
                parentColumns = "id", childColumns = "sale_type_id"))
public class Cost {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "sale_type_id")
    private String saleTypeId;

    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "quantity")
    private Integer quantity;
    @ColumnInfo(name = "price")
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(String saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
