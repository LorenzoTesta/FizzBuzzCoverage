package xyz.testalorenzo.calc;

public class Calc {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mult(Integer a, Integer b) {
        return a * b;
    }

    public static int pow(Integer a, Integer b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

}
