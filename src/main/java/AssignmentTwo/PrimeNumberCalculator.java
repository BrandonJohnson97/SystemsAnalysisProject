package AssignmentTwo;

/**
 * A class to check if a number is prime and get factorization of a prime
 * <pre>
 * A natural number (positive Integer) is prime if it’s divisible by only 1 and itself. For example, 2, 3, 5 and 7
 * are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime. (Hint: use the Mod
 * operator - if a number x divides another number y and the remainder is 0 and x>=2 then x divides y and
 * therefore y is not prime.) {@code (x%y == 0 && x>=2))}
 * Every integer has a unique representation of primes called it’s Unique Prime
 * Factorization. For example 8 has a unique prime factorization of 2*2*2 and 25 has 5*5
 * </pre>
 * @author 20168209
 */
public class PrimeNumberCalculator {
    /**
     * Check to see if integer passed in is a prime number.
     * @param number integer to test
     * @return True if number is a prime number
     */
    public static boolean isPrime(int number) {
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Get the unique prime factorization of an integer. Example would be 8's unique prime factorization
     * is 2*2*2. A prime number will only return its own value.
     * @param n integer to get the unique prime factorization
     * @return String of the unique prime factorization of integer
     */
    public static String getUniquePrimeFactorization(int n) {
        String primeFactored = "";
        if (n <= 0){
            System.out.println("Enter a positive number greater than 0");
        }
        if(n == 1){
            return "1";
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeFactored = primeFactored + i;
                n = n / i;
                i--;
                if(i < n){
                    primeFactored += "*";
                };
            }
        }
        return primeFactored;
    }
}

