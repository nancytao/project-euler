import java.util.ArrayList;
import java.util.List;

/**
 * Find the sum of all the primes below two million.
 *
 * @author Nancy Tao
 * @version 12/11/2015
 */
public class Problem10 {
    public static void main(String[] args) {
        PrimeGenerator pg = new Problem10.PrimeGenerator(2000000);
        List<Integer> primes = pg.getListOfPrimes();

        long sum = 0;
        for (Integer i : primes) {
            sum += i;
        }

        System.out.println(sum);
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