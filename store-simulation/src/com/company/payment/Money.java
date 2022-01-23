package com.company.payment;

public class Money implements Payment {
    int remain;

    public Money(int remain) {
        this.remain = remain;
    }

    @Override
    public boolean canPay(int price) {
        return remain >= price;
    }

    @Override
    public void use(int price) {
        remain -= price;
    }
}
