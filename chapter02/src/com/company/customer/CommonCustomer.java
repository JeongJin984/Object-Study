package com.company.customer;

import com.company.Product.Product;
import com.company.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class CommonCustomer implements Customer{
    private List<Product> order;
    private Payment[] payment;

    public CommonCustomer(List<Product> order, Payment[] payment) {
        this.order = order;
        this.payment = payment;
    }

    @Override
    public Payment pay(int total) {
        for(Payment p : payment) {
            if(p.canPay(total)) {
                p.use(total);
                return p;
            }
        }
        throw new IllegalArgumentException("Illegal Access");
    }

    @Override
    public List<Product> order() {
        return order;
    }
}
