package com.company.Employee;

import com.company.POS.POS;
import com.company.Receipt.Receipt;
import com.company.customer.Customer;
import com.company.discountPolicy.DiscountPolicy;
import com.company.storage.Storage;
import javafx.geometry.Pos;

public interface Employee {
    Receipt handle(Customer customer) throws IllegalAccessException;
}
