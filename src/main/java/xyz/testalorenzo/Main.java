package xyz.testalorenzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private final static int FIZZ = 3;
    private final static int BUZZ = 5;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi!\n");
        try {
            int num = getNumberFromUser(reader);
            play(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getNumberFromUser(BufferedReader reader) throws IOException {
        System.out.println("give me a number:");
        String userInput = reader.readLine();
        return Integer.parseInt(userInput);
    }

    static void play(int num) {
        for (int i = 1; i <= num; i++)
        {
            if (((i % FIZZ) == 0) && ((i % BUZZ) == 0)) // Is it a multiple of fizz & buzz?
                System.out.println("fizzbuzz");
            else if ((i % FIZZ) == 0) // Is it a multiple of fizz?
                System.out.println("fizz");
            else if ((i % BUZZ) == 0) // Is it a multiple of BUZZ?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of FIZZ or BUZZ
        }
    }
}
