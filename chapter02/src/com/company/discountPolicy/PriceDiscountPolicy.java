package com.company.discountPolicy;

import com.company.Product.Product;
import com.company.discountCondition.DiscountCondition;

public class PriceDiscountPolicy implements DiscountPolicy {

    DiscountCondition condition;

    public PriceDiscountPolicy(DiscountCondition condition) {
        this.condition = condition;
    }

    @Override
    public int getDiscountAmount(Product product, int date) {
        if(condition.isSatisfiedBy(product, date)) {
            return 100;
        } else {
            return 0;
        }
    }
}
