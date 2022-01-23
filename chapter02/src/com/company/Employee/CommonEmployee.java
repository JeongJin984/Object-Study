package com.company.Employee;

import com.company.POS.POS;
import com.company.Product.Product;
import com.company.Receipt.Receipt;
import com.company.customer.Customer;
import com.company.discountPolicy.DiscountPolicy;
import com.company.payment.Payment;
import com.company.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class CommonEmployee implements Employee{

    private Storage storage;
    private POS pos;
    private DiscountPolicy policy;

    public CommonEmployee(Storage storage, POS pos, DiscountPolicy policy) {
        this.storage = storage;
        this.pos = pos;
        this.policy = policy;
    }

    @Override
    public Receipt handle(Customer customer) throws IllegalAccessException {
        int totalPrice = totalPrice(customer.order(), policy);
        getProducts(storage, customer.order());
        Payment payment = customer.pay(totalPrice);

        return new Receipt(payment);
    }

    public Integer totalPrice(List<Product> order, DiscountPolicy policy) {
        int total = 0;
        for(Product p : order) {
            total += p.getPrice() - policy.getDiscountAmount(p, 1000);
        }
        return total;
    }

    public List<Product> getProducts(Storage storage, List<Product> order) throws IllegalAccessException {
        List<Product> result = new ArrayList<>();
        for(Product p : order) {
            if(storage.isRemain(p)) {
                result.add(p);
            } else {
                throw new IllegalAccessException("lack of Stock");
            }
        }
        return result;
    }
}
