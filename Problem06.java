/**
 * Find the difference between the sum of the squares of the first 100 natural
 *     numbers and the square of the sum.
 * @author Nancy Tao
 * @version 11/09/2015
 */
public class Problem06 {
    public static void main(String[] args) {
        System.out.println(new Problem06().difference(100));
    }

    public int difference(int firstXNumbers) {
        int sum = 0;
        int sumOfSquares = 0;

        for (int i = 1; i < firstXNumbers + 1; i++) {
            sum += i;
            sumOfSquares += i * i;
        }

        return sum * sum - sumOfSquares;
    }
}