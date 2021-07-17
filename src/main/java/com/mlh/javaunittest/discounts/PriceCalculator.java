package com.mlh.javaunittest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private double discount = 0;
    private List<Double> prices = new ArrayList<>();

    public double getTotal() {
        double result = 0;

        for (Double price : prices) {
            result += price;
        }

        return result * ((100 - this.discount) / 100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
