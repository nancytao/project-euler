/**
 * What is the value of the first triangle number to have over five hundred divisors?
 * The nth triangle number is equal to the sum of the n natural numbers from 1 to n.
 *     (Thanks based Wikipedia)
 *
 * @author Nancy Tao
 * @version 12/11/2015
 */
public class Problem12 {
    public static void main(String[] args) {
        System.out.println(new Problem12().triangleNumWithnFactors(500));
    }

    public int triangleNumWithnFactors(int n) {
        int triangleNum = 0;
        for (int i = 1; ; i++) {
            triangleNum += i;
            if (numDivisors(triangleNum) > 500) {
                return triangleNum;
            }
        }
    }

    /**
     * Counts the number of divisors of a given number
     */
    private int numDivisors(int num) {
        int divisorCount = 0;
        int sqrt = (int) (Math.sqrt(num));
        for (int i = 1; i < sqrt; i++) {
            if (num % i == 0) {
                divisorCount += 2;
            }
        }

        if (sqrt * sqrt == num) {
            divisorCount++;
        }

        return divisorCount;
    }
}