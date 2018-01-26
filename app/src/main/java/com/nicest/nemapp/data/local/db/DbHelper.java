package com.nicest.nemapp.data.local.db;

import com.nicest.nemapp.data.model.db.Customer;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by wfm-vp on 1/11/18
 */

public interface DbHelper {

    Observable<Boolean> insertCustomer(final Customer customer);

    Observable<List<Customer>> findAllCustomers();

    Observable<Customer> findOneCustomer(final Long customerId);

}
