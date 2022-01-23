package com.company.discountCondition;

import com.company.Product.Product;

public interface DiscountCondition {
    boolean isSatisfiedBy(Product product, int date);
}
