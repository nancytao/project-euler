import java.math.BigInteger;

/**
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317. Find the last ten digits of the series,
 * 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 *
 * @author Nancy Tao
 * @version 12/22/2015
 */
public class Problem48 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }

        String sumString = sum.toString();
        System.out.print(sumString.substring(sumString.length() - 10));
    }
}