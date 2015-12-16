/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly
 * into n). If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a
 * and b are called amicable numbers. Evaluate the sum of all the amicable numbers under 10000.
 *
 * @author Nancy Tao
 * @version 12/16/2015
 */
public class Problem21 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (isAmicable(i)) {
                sum += i;
            }
        }
        System.out.print(sum);
    }

    private static boolean isAmicable(int n) {
        int nSumOfDivisors = sumOfDivisors(n);
        if (nSumOfDivisors != n && sumOfDivisors(nSumOfDivisors) == n) {
            return true;
        } else {
            return false;
        }
    }

    private static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}