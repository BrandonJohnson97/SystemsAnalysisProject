package AssignmentTwo;

/**
 *  A class that allows someone to check and generate Fibonacci Numbers.
 *
 *  <pre>
 * the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such
 * that each number is the sum of the two preceding ones, starting from 0 and 1. That is:
 * {@code F_0 = 0
 * F_1 = 1
 * int n;
 *  N = N-1 + N-2;}
 *  </pre>
 *
 * @author 20168209
 */
public class FibonacciCalculator {

    /**
     * Check to see if integer passed in is a Fibonacci number. Warning - Fibonacci numbers get
     * Large fast so be cautious of size of number int
     * @param number integer to test
     * @return true if number is a Fibonacci Number
     */
    public static boolean isFibonacciNumber(int number){
        int numberOne = 0;
        int numberTwo = 1;
        if(number <= 3 && number >= 0){
            return true;
        }
        for(int i = 2; i <= number; i++) {
            int nextNumber = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = nextNumber;
            if(number == numberTwo){
                return true;
            }
        }
        return false;
    }

    /**
     * Get the nth number in the Fibonacci sequence
     * @param n the position in the Fibonacci sequence
     * @return value of the nth Fibonacci number
     */
    public static int getFibonacciNumber(int n){
        int numberOne = 0;
        int numberTwo = 1;
        if(n <= 0){
            return 0;
        }
        for(int i = 2; i <= n; i++) {
            int nextNumber = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = nextNumber;
        }
        return numberTwo;
    }
}
