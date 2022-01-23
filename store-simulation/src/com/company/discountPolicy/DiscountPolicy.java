package com.company.discountPolicy;

import com.company.Product.Product;

public interface DiscountPolicy {
    int getDiscountAmount(Product product, int date);
}
