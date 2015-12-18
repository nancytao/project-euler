import java.util.*;

/**
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously
 * remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly
 * we can work from right to left: 3797, 379, 37, and 3. Find the sum of the only eleven primes that
 * are both truncatable from left to right and right to left. NOTE: 2, 3, 5, and 7 are not
 * considered to be truncatable primes.
 *
 * @author Nancy Tao
 * @version 12/17/2015
 */
public class Problem37 {
    static List<Integer> primes;

    public static void main(String[] args) {
        int sum = 0;

        PrimeGenerator pg = new PrimeGenerator(1000000);
        primes = pg.getListOfPrimes();

        for (int counter = 0, index = 5; counter < 11; index++) {
            if (isTruncatablePrime(primes.get(index))) {
                sum += primes.get(index);
                counter++;
            }
        }

        System.out.print(sum);
    }

    public static boolean isTruncatablePrime(int num) {
        if (!primes.contains(num)) {
            return false;
        }

        for (int i = 1; i < String.valueOf(num).length(); i++) {
            if (!primes.contains(Integer.parseInt(String.valueOf(num).substring(i)))) {
                return false;
            }
            if (!primes.contains(Integer.parseInt(String.valueOf(num).substring(0, i)))) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}