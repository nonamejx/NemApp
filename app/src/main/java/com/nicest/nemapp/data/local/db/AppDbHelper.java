package com.nicest.nemapp.data.local.db;

import com.nicest.nemapp.data.model.db.Customer;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by wfm-vp on 1/11/18
 */

@Singleton
public class AppDbHelper implements DbHelper {

    private final AppDatabase mAppDatabase;

    @Inject
    public AppDbHelper(AppDatabase appDatabase) {
        this.mAppDatabase = appDatabase;
    }

    @Override
    public Observable<Boolean> insertCustomer(final Customer customer) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.customerDao().insert(customer);
                return true;
            }
        });
    }

    @Override
    public Observable<List<Customer>> findAllCustomers() {
        return Observable.fromCallable(new Callable<List<Customer>>() {
            @Override
            public List<Customer> call() throws Exception {
                return mAppDatabase.customerDao().findAll();
            }
        });
    }

    @Override
    public Observable<Customer> findOneCustomer(final Long customerId) {
        return Observable.fromCallable(new Callable<Customer>() {
            @Override
            public Customer call() throws Exception {
                return mAppDatabase.customerDao().findOne(customerId);
            }
        });
    }
}
