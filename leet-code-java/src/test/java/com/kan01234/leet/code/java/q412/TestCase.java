package com.kan01234.leet.code.java.q412;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    Solution fizzBuzz = new Solution();

    @Test
    public void test() throws Exception {
        assertEquals(fizzBuzz.fizzBuzz(3), Arrays.asList("1", "2", "Fizz"));
        assertEquals(fizzBuzz.fizzBuzz(5), Arrays.asList("1", "2", "Fizz", "4", "Buzz"));
        assertEquals(fizzBuzz.fizzBuzz(15), Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
    }
}
