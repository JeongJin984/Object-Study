package com.company;

import com.company.Employee.CommonEmployee;
import com.company.Employee.Employee;
import com.company.POS.POS;
import com.company.Product.Product;
import com.company.customer.CommonCustomer;
import com.company.discountCondition.ProductCondition;
import com.company.discountPolicy.PriceDiscountPolicy;
import com.company.payment.Card;
import com.company.payment.Money;
import com.company.payment.Payment;
import com.company.storage.CommonStorage;
import com.company.storage.Storage;
import com.company.store.CommonStore;
import com.company.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new CommonEmployee();

        Storage storage = new CommonStorage();
        Store store = new CommonStore(employee, new POS(), storage, new PriceDiscountPolicy(new ProductCondition()));

        List<Product> order = new ArrayList<>();
        order.add(storage.getProduct("orange"));
        order.add(storage.getProduct("orange"));
        order.add(storage.getProduct("orange"));

        Payment[] payments = new Payment[2];
        payments[0] = new Money(5000);
        payments[1] = new Card();
        try {
            System.out.println(store.enter(new CommonCustomer(order, payments)));
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
