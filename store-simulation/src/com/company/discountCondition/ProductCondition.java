package com.company.discountCondition;

import com.company.Product.Product;

public class ProductCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Product product, int date) {
        if(product.getName().equals("orange")) {
            return true;
        }
        return false;
    }
}
