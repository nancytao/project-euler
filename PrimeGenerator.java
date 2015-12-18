import java.util.ArrayList;
import java.util.List;

/**
 * Generates prime numbers up to a given limit, exclusive
 *
 * @author Nancy Tao
 * @version 12/17/2015
 */
public class PrimeGenerator {
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

    /**
     * @return List of prime numbers under the limit, in order
     */
    public List<Integer> getListOfPrimes() {
        return listOfPrimes;
    }
}