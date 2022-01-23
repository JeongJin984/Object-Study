package com.company.payment;

public interface Payment {
    boolean canPay(int price);
    void use(int price);
}
