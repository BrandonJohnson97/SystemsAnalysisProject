/**
 * @author 20168209
 */
import AssignmentTwo.PrimeNumberCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCalculatorTest {

    @DisplayName("Test if number is a Prime or not")
    @Test
    void isPrime() {
        assertEquals(true, PrimeNumberCalculator.isPrime(9901));
        assertEquals(true, PrimeNumberCalculator.isPrime(85369));
        assertEquals(true, PrimeNumberCalculator.isPrime(896573));
        assertEquals(true, PrimeNumberCalculator.isPrime(41));
        assertEquals(true, PrimeNumberCalculator.isPrime(2));
        assertEquals(false, PrimeNumberCalculator.isPrime(4));
        assertEquals(false, PrimeNumberCalculator.isPrime(-4));
        assertEquals(false, PrimeNumberCalculator.isPrime(7474));
        assertEquals(false, PrimeNumberCalculator.isPrime(999924));
        assertEquals(false, PrimeNumberCalculator.isPrime(83968));
        assertEquals(false, PrimeNumberCalculator.isPrime(0));


    }

    @DisplayName("Test the UPF if product is correct or not")
    @Test
    void getUniquePrimeFactorization() {
        assertEquals("2*5*5", PrimeNumberCalculator.getUniquePrimeFactorization(50));
        assertEquals("2*2*2*5*5*5", PrimeNumberCalculator.getUniquePrimeFactorization(1000));
        assertEquals("5*197", PrimeNumberCalculator.getUniquePrimeFactorization(985));
        assertEquals("701", PrimeNumberCalculator.getUniquePrimeFactorization(701)); // Prime Number
        assertEquals("2*2*2*2*3*3*5", PrimeNumberCalculator.getUniquePrimeFactorization(720));
        assertEquals("", PrimeNumberCalculator.getUniquePrimeFactorization(-548)); // Shows blank because negative
        assertEquals("17*17", PrimeNumberCalculator.getUniquePrimeFactorization(289));
        assertEquals("2*2*3*5*5", PrimeNumberCalculator.getUniquePrimeFactorization(300));
        assertEquals("2*3", PrimeNumberCalculator.getUniquePrimeFactorization(6));
        assertEquals("7*17*17*281", PrimeNumberCalculator.getUniquePrimeFactorization(568463));
        assertEquals("2*2*255253", PrimeNumberCalculator.getUniquePrimeFactorization(1021012));
        assertEquals("3*3*5*5*5*7*7*157", PrimeNumberCalculator.getUniquePrimeFactorization(8654625));
        assertEquals("", PrimeNumberCalculator.getUniquePrimeFactorization(0)); // Blank because not prime number



    }
}