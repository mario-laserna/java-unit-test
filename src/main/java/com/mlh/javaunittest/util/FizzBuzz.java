package com.mlh.javaunittest.util;

public class FizzBuzz {

    public String fizzBuzz(int value) {
        String result = "";

        if(value % 3 == 0) result += "Fizz";
        if(value % 5 == 0) result += "Buzz";

        return StringUtil.isEmpty(result) ? ""+value : result;
    }
}
