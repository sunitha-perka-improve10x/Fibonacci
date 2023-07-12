package fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void nothing() {
        /*
        input _
         */

    }
    @Test
    public void givenAnyNegativeNumber_returnNegativeNumber(){
        Fiboncci fiboncci = new Fibonacci();
        int negativeFibonacci = fiboncci.find(-10);
        assertEquals(-1,negativeFibonacci);

    }
    @Test
    public void givenZeroNumber_returnZero(){
        Fiboncci fiboncci = new Fiboncci();
        int zeroth = fiboncci.find(0);
        assertEquals(0,zeroth);
    }
    @Test
    public void givenOne_returnOne(){
        Fiboncci fiboncci = new Fiboncci();
        int firstFibonacci = fiboncci.find(1);
        assertEquals(1,firstFibonacci);
    }
    @Test
    public void givenTwo_returnOne(){
        Fiboncci fiboncci = new Fiboncci();
        int secondFibonacci = fiboncci.find(2);
        assertEquals(1,secondFibonacci);
    }
}
