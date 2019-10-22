/**
 * Write a function named primeCount with signature
 * int primeCount(int start, int end);
 * The function returns the number of primes between start and end inclusive.
 * Recall that a prime is a positive integer greater than 1 whose only integer
 * factors are 1 and itself.
 * Examples
 * If start
 * is
 * and
 * end is
 * return
 * reason
 * 10 30 6 The primes between 10 and 30 inclusive are 11, 13, 17, 19, 23 and 29
 * 11 29 6 The primes between 11 and 29 inclusive are 11, 13, 17, 19, 23 and 29
 * 20 22 0 20, 21, and 22 are all non-prime
 * 1 1 0 By defnition, 1 is not a prime number
 * 5 5 1 5 is a prime number
 * 6 2 0 start must be less than or equal to end
 * -10 6 3 primes are greater than 1 and 2, 3, 5 are prime
 */

public class PrimeCount {

    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
    }

    public static int primeCount(int start, int end) {
        if (start == end && start == 1) {
            return 0;
        } else if (start > end || end < 2) {
            return 0;
        } else {
            int count = 0;
            if (start < 2) {
                start = 2;
            }
            for (int i = start; i <= end; i++) {
                if (isPrimeNum(i)) {
                    count++;
                }
            }
            return count;
        }
    }

    public static boolean isPrimeNum(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
