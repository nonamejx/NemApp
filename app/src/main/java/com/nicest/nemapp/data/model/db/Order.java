package com.nicest.nemapp.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by wfm-vp on 1/10/18.
 */

@Entity(tableName = "order",
        foreignKeys = {
                @ForeignKey(entity = PriceLevel.class, parentColumns = "id", childColumns = "price_level_id"),
                @ForeignKey(entity = Customer.class, parentColumns = "id", childColumns = "customer_id"),
                @ForeignKey(entity = OrderStatus.class, parentColumns = "id", childColumns = "order_status_id")})
public class Order {
    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "quantity")
    private Long quantity;

    @ColumnInfo(name = "delivery_date")
    private Date deliveryDate;

    @ColumnInfo(name = "price_level_id")
    private Long priceLevelId;

    @ColumnInfo(name = "customer_id")
    private Long customerId;

    @ColumnInfo(name = "order_status_id")
    private Long orderStatusId;

    @ColumnInfo(name = "createdDate")
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getPriceLevelId() {
        return priceLevelId;
    }

    public void setPriceLevelId(Long priceLevelId) {
        this.priceLevelId = priceLevelId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Long orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
