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
        PrimeGenerator pg = new PrimeGenerator(1000000);
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
}