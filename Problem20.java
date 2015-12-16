import java.math.BigInteger;

/**
 * Find the sum of the digits in the number 100!
 *
 * @author Nancy Tao
 * @version 12/16/2015
 */
public class Problem20 {

    public static void main(String[] args) {
        String factorial = factorial(100).toString();

        int sum = 0;
        for (int i = 0; i < factorial.length(); i++) {
            sum += factorial.charAt(i) - '0';
        }

        System.out.println(sum);
    }

    public static BigInteger factorial(int n) {
        BigInteger product = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
}