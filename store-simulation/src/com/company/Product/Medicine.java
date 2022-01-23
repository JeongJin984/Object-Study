package com.company.Product;

public class Medicine implements Product{
    public String name;
    public Integer price;

    public Medicine(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Product p = (Product) obj;
        return this.name.equals(p.getName());
    }


    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
