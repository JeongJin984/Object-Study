package com.company.storage;

import com.company.Product.Beverage;
import com.company.Product.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonStorage implements Storage{

    Map<Product, Integer> map = new HashMap<>();
    Map<String, Product> list = new HashMap<>();

    public CommonStorage() {
        Product p1 = new Beverage("orange", false, 1000);
        list.put("orange", p1);
        map.put(p1, 100);
    }

    @Override
    public Product getProduct(String name) {
        return list.get(name);
    }

    @Override
    public boolean isRemain(Product product) {
        return map.get(product) != 0;
    }
}
