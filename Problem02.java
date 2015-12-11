/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 *
 * @author Nancy Tao
 * @version 11/06/2015
 */
public class Problem02 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; ; i++) {
            int fibNum = fibonacci(i);

            if (fibNum > 4000000) {
                break;
            }

            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
        }

        System.out.println(sum);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}