package com.company.customer;

import com.company.Product.Product;
import com.company.payment.Payment;

import java.util.List;

public interface Customer {
    public Payment pay(int total);
    public List<Product> order();
}
