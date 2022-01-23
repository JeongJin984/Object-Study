package com.company.payment;

public class Card implements Payment{
    @Override
    public boolean canPay(int price) {
        return true;
    }

    @Override
    public void use(int price) {
    }
}
