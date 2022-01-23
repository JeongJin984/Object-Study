package com.company.Receipt;

import com.company.payment.Card;
import com.company.payment.Money;
import com.company.payment.Payment;

public class Receipt {
    String content;

    public Receipt(Payment payment) {
        if(payment instanceof Money) {
            content = "현금 결제";
        } else if(payment instanceof Card) {
            content = "카드 결제";
        }
    }
}
