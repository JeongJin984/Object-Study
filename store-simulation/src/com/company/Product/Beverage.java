package com.company.Product;

public class Beverage implements Product {

    public String name;
    public Boolean isAlcoholic;
    public Integer price;

    public Beverage(String name, Boolean isAlcoholic, Integer price) {
        this.name = name;
        this.isAlcoholic = isAlcoholic;
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

    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }
}
