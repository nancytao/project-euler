import java.util.ArrayList;
import java.util.List;

/**
 * Find the sum of all the primes below two million.
 *
 * @author Nancy Tao
 * @version 12/17/2015
 */
public class Problem10 {
    public static void main(String[] args) {
        PrimeGenerator pg = new PrimeGenerator(2000000);
        List<Integer> primes = pg.getListOfPrimes();

        long sum = 0;
        for (Integer i : primes) {
            sum += i;
        }

        System.out.println(sum);
    }
}