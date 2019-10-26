package xyz.testalorenzo.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {

    private int FIZZ;
    private int BUZZ;

    FizzBuzz(int fizz, int buzz) {
        this.FIZZ = fizz;
        this.BUZZ = buzz;
    }

    List<String> play(int num) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= num; i++)
        {
            if (((i % FIZZ) == 0) && ((i % BUZZ) == 0)) // Is it a multiple of fizz & buzz?
                result.add("fizzbuzz");
            else if ((i % FIZZ) == 0) // Is it a multiple of fizz?
                result.add("fizz");
            else if ((i % BUZZ) == 0) // Is it a multiple of BUZZ?
                result.add("buzz");
            else
                result.add(String.valueOf(i)); // Not a multiple of FIZZ or BUZZ
        }
        return result;
    }
}
