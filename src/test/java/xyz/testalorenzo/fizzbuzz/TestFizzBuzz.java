package xyz.testalorenzo.fizzbuzz;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestFizzBuzz {

    @Data
    @AllArgsConstructor
    private static class Parameters {
        private int fizz;
        private int buzz;
        private int num;
    }

    @Test
    void playTest() {
        FizzBuzz fizzBuzz = new FizzBuzz(2, 3);
        fizzBuzz.play(7);
    }

    @Test
    void okParamTest() {
        Map<Parameters, List<String>> testParameters = new HashMap<>();
        testParameters.put(new Parameters(0, 0, 0), Collections.emptyList());
        String fizzbuzz = "fizzbuzz";
        testParameters.put(new Parameters(1, 1, 5), Arrays.asList(fizzbuzz, fizzbuzz, fizzbuzz, fizzbuzz, fizzbuzz));
        testParameters.put(new Parameters(2, 2, 5), Arrays.asList("1", fizzbuzz, "3", fizzbuzz, "5"));
        String fizz = "fizz";
        testParameters.put(new Parameters(1, 2, 5), Arrays.asList(fizz, fizzbuzz, fizz, fizzbuzz, fizz));
        String buzz = "buzz";
        testParameters.put(new Parameters(2, 3, 9), Arrays.asList("1", fizz, buzz, fizz, "5", fizzbuzz, "7", fizz, buzz));

        testParameters.forEach((params, expected) -> {
            FizzBuzz fizzBuzz = new FizzBuzz(params.getFizz(), params.getBuzz());
            List<String> result = fizzBuzz.play(params.getNum());
            assertEquals(expected, result);
        });
    }


    @Test
    void koParamTest() {
        Map<Parameters, Exception> testParameters = new HashMap<>();
        testParameters.put(new Parameters(0, 0, 5), new ArithmeticException());
        testParameters.put(new Parameters(0, 1, 3), new ArithmeticException());
        testParameters.put(new Parameters(1, 0, 44), new ArithmeticException());

        testParameters.forEach((params, expected) -> {
            assertThrows(expected.getClass(), ()-> {
                FizzBuzz fizzBuzz = new FizzBuzz(params.getFizz(), params.getBuzz());
                fizzBuzz.play(params.getNum());
            });
        });
    }


}
