package com.company.discountCondition;

import com.company.Product.Product;

public class PeriodCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Product product, int date) {
        if(date < 100) {
            return true;
        }
        return false;
    }
}
