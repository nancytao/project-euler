import java.math.BigInteger;

/**
 * The first known prime found to exceed one million digits was discovered in 1999, and is a
 * Mersenne prime of the form 2^6972593−1; it contains exactly 2,098,960 digits. Subsequently other
 * Mersenne primes, of the form 2^p−1, have been found which contain more digits. However, in 2004
 * there was found a massive non-Mersenne prime which contains 2,357,207 digits: 28433×2^7830457+1.
 * Find the last ten digits of this prime number.
 *
 * @author Nancy Tao
 * @version 12/27/2015
 */
public class Problem97 {

    public static void main(String[] args) {
        BigInteger bi = BigInteger.valueOf(2);
        bi = bi.pow(7830457).multiply(BigInteger.valueOf(28433)).add(BigInteger.valueOf(1));

        String asString = bi.toString();
        System.out.println(asString.substring(asString.length() - 10));
    }
}