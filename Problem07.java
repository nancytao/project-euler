/**
 * What is the 10 001st prime number?
 *
 * @author Nancy Tao
 * @version 11/09/2015
 */
public class Problem07 {
    public static void main(String[] args) {
        System.out.println(new Problem07().nthPrime(10001));
    }

    public int nthPrime(int n) {
        int counter = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                counter++;
                if (counter == n) {
                    return i;
                }
            }
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}