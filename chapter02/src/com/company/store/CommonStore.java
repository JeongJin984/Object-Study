package com.company.store;

import com.company.Employee.Employee;
import com.company.POS.POS;
import com.company.Receipt.Receipt;
import com.company.customer.Customer;
import com.company.discountPolicy.DiscountPolicy;
import com.company.storage.Storage;

public class CommonStore implements Store {
    private Employee employee;
    private POS pos;
    private Storage storage;
    private DiscountPolicy discountPolicy;

    public CommonStore(Employee employee, POS pos, Storage storage, DiscountPolicy discountPolicy) {
        this.employee = employee;
        this.pos = pos;
        this.storage = storage;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Receipt enter(Customer customer) throws IllegalAccessException {
        return employee.handle(customer);
    }
}
