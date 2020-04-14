package xyz.testalorenzo.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sum() {
        int result = Calc.sum(1, 2);
        assertEquals(3, result);

        // Integer.MAX_VALUE = 2147483647
//        result = Calc.sum(Integer.MAX_VALUE, 1);
//        assertEquals(?, result);
    }

    @Test
    void div() {

    }

    @Test
    void mult() {

    }

    @Test
    void pow() {

    }

}
