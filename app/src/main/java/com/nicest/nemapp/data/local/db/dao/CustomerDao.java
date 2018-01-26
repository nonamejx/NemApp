package com.nicest.nemapp.data.local.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.nicest.nemapp.data.model.db.Customer;

import java.util.List;

/**
 * Created by wfm-vp on 1/11/18
 */

@Dao
public interface CustomerDao {

    @Query("SELECT id, customer_name FROM customer")
    List<Customer> findAll();

    @Query("SELECT id, customer_name FROM customer WHERE id = :customerId")
    Customer findOne(Long customerId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Customer customer);

    @Delete
    void delete(Customer customer);

}
