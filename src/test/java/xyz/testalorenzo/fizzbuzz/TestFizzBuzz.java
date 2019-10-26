package xyz.testalorenzo.fizzbuzz;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {

    @Test
    void playTest() {
        FizzBuzz fizzBuzz = new FizzBuzz(2, 3);
        fizzBuzz.play(7);
    }



}
