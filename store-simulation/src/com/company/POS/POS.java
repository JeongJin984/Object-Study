package com.company.POS;

public class POS {
    private int money;

    public int payChange(int pay, int price) {
        money += pay;
        money = money - (pay - price) > 0 ? (pay - price) : 0;
        return pay - price;
    }
}
