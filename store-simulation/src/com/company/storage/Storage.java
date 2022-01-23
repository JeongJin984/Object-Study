package com.company.storage;

import com.company.Product.Product;

public interface Storage {
    Product getProduct(String name);

    boolean isRemain(Product product);
}
