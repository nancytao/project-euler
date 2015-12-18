import java.util.ArrayList;
import java.util.List;

/**
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and
 * 719, are themselves prime. There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31,
 * 37, 71, 73, 79, and 97. How many circular primes are there below one million?
 *
 * @author Nancy Tao
 * @version 12/17/2015
 */
public class Problem35 {
    static List<Integer> primes;
    public static void main(String[] args) {
        PrimeGenerator pg = new Problem35.PrimeGenerator(1000000);
        primes = pg.getListOfPrimes();

        int count = 0;

        for (int i : primes) {
            if (isCircularPrime(i)) {
                count++;
            }
        }

        System.out.print(count);
    }

    private static boolean isCircularPrime(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if (!primes.contains(Integer.parseInt(str.substring(i) + str.substring(0, i)))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Generates prime numbers up to a given limit, exclusive
     */
    private static class PrimeGenerator {
        private int upperLimit;
        private List<Integer> listOfPrimes;

        public PrimeGenerator(int upperLimit) {
            this.upperLimit = upperLimit;
            this.listOfPrimes = new ArrayList<Integer>();

            generateListOfPrimes();
        }

        private void generateListOfPrimes() {
            //generates an array of booleans, where true indicates that the index is a prime number
            boolean[] isPrime = new boolean[upperLimit];

            for (int i = 2; i < upperLimit; i++) {
                isPrime[i] = true;
            }

            //uses Sieve of Eratosthenes, thank you based Wikipedia
            //basically if i is prime, multiples of i are marked as not prime
            for (int i = 2; i * i < upperLimit; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j < upperLimit; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    listOfPrimes.add(i);
                }
            }
        }

        public List<Integer> getListOfPrimes() {
            return listOfPrimes;
        }
    }
}