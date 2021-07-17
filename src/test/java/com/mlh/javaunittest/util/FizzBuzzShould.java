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
        assertEquals(fizzBuzz.fizzBuzz(3), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(6), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(9), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(27), "Fizz");
    }

    @Test
    public void return_buzz_if_divisible_by_5() {
        assertEquals(fizzBuzz.fizzBuzz(5), "Buzz");
        assertEquals(fizzBuzz.fizzBuzz(10), "Buzz");
        assertEquals(fizzBuzz.fizzBuzz(20), "Buzz");
        assertEquals(fizzBuzz.fizzBuzz(35), "Buzz");
    }

    @Test
    public void return_fizzbuzz_if_divisible_by_3_and_5() {
        assertEquals(fizzBuzz.fizzBuzz(15), "FizzBuzz");
        assertEquals(fizzBuzz.fizzBuzz(30), "FizzBuzz");
        assertEquals(fizzBuzz.fizzBuzz(60), "FizzBuzz");
        assertEquals(fizzBuzz.fizzBuzz(90), "FizzBuzz");
    }

    @Test
    public void return_number_if_not_divisible_by_3_and_or_5() {
        assertEquals(fizzBuzz.fizzBuzz(1), "1");
        assertEquals(fizzBuzz.fizzBuzz(2), "2");
        assertEquals(fizzBuzz.fizzBuzz(13), "13");
        assertEquals(fizzBuzz.fizzBuzz(16), "16");
        assertEquals(fizzBuzz.fizzBuzz(82), "82");
    }
}