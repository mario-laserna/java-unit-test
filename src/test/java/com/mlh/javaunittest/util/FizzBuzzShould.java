package com.mlh.javaunittest.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {
    private FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    /*
        Si el número es divisible por 3, retorna “Fizz”
        Si el número es divisible por 5, retorna “Buzz”
        Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
        En otro caso, retorna el mismo número
     */

    @Test
    public void return_fizz_if_divisible_by_3() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(27));
    }

    @Test
    public void return_buzz_if_divisible_by_5() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(20));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(35));
    }

    @Test
    public void return_fizzbuzz_if_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(60));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(90));
    }

    @Test
    public void return_number_if_not_divisible_by_3_and_or_5() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
        assertEquals("2", fizzBuzz.fizzBuzz(2));
        assertEquals("13", fizzBuzz.fizzBuzz(13));
        assertEquals("16", fizzBuzz.fizzBuzz(16));
        assertEquals("82", fizzBuzz.fizzBuzz(82));
    }
}