/**
 * @author 20168209
 */
import static org.junit.jupiter.api.Assertions.*;

import AssignmentTwo.FibonacciCalculator;
import org.junit.jupiter.api.DisplayName;

class FibonacciCalculatorTest {

    @DisplayName("Test isFibonacciNumber on #'s that are Fibonacci")
    @org.junit.jupiter.api.Test
    void isFibonacciNumber() {
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(987));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(377));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(13));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(2));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(46368));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(75025));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(0));
        assertEquals(false, FibonacciCalculator.isFibonacciNumber(-13));
        assertEquals(false, FibonacciCalculator.isFibonacciNumber(75000));
        assertEquals(false, FibonacciCalculator.isFibonacciNumber(998));
        assertEquals(false, FibonacciCalculator.isFibonacciNumber(3434));

    }

    @DisplayName("Test if number gives correct Fibonacci number")
    @org.junit.jupiter.api.Test
    void getFibonacciNumber() {
        assertEquals(701408733, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(9227465, FibonacciCalculator.getFibonacciNumber(35));
        assertEquals(121393, FibonacciCalculator.getFibonacciNumber(26));
        assertEquals(8, FibonacciCalculator.getFibonacciNumber(6));
        assertEquals(89, FibonacciCalculator.getFibonacciNumber(11));
        assertEquals(610, FibonacciCalculator.getFibonacciNumber(15));
        assertEquals(0, FibonacciCalculator.getFibonacciNumber(-15));
        assertEquals(1, FibonacciCalculator.getFibonacciNumber(1));
        assertEquals(1, FibonacciCalculator.getFibonacciNumber(2));
        assertEquals(0, FibonacciCalculator.getFibonacciNumber(0));
    }
}