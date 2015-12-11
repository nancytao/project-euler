/**
 * Find the largest prime factor of the number 600851475143
 *
 * @author Nancy Tao
 * @version 11/07/2015
 */
public class Problem03 {
    public static void main(String[] args) {
        System.out.println(new Problem03().largestPrimeFactor(600851475143L));
    }

    public long largestPrimeFactor(long num) {
        while (true) {
            long factor = smallestFactor(num);
            if (factor < num) {
                num = num / factor;
            } else {
                return num;
            }
        }
    }

    private long smallestFactor(long num) {
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return i;
            }
        }

        return num;
    }
}