import java.math.BigInteger;

/**
 * What is the sum of the digits of the number 2^1000?
 *
 * @author Nancy Tao
 * @version 12/13/2015
 */
public class Problem16 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2");
        num = num.pow(1000);

        int sum = 0;
        String numString = num.toString();
        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(numString.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}