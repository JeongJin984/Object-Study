package com.company.store;

import com.company.Receipt.Receipt;
import com.company.customer.Customer;

public interface Store {
    public Receipt enter(Customer customer) throws IllegalAccessException;
}
