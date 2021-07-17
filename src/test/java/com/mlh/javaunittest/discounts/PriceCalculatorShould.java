package com.mlh.javaunittest.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {
    private PriceCalculator priceCalculator;

    @Before
    public void setup(){
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_prices() {
        assertEquals(priceCalculator.getTotal(), 0, 0);
    }

    @Test
    public void total_is_sum_of_prices() {
        priceCalculator.addPrice(10.2);
        priceCalculator.addPrice(15.5);

        assertEquals(priceCalculator.getTotal(), 25.7, 0);
    }

    @Test
    public void apply_discount_to_prices() {
        priceCalculator.addPrice(12.5);
        priceCalculator.addPrice(17.5);

        priceCalculator.setDiscount(25);

        assertEquals(priceCalculator.getTotal(), 22.5, 0);
    }
}