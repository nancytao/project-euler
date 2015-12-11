/**
 * Find the sum of all the multiples of 3 and 5 below 1000
 *
 * @author Nancy Tao
 * @version 11/06/2015
 */
public class Problem01 {
    public static void main(String[] args) {
        System.out.println(new Problem01().sum(1000));
    }

    public int sum(int upperLimit) {
        int toReturn = 0;
        for (int i = 0; i < upperLimit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                toReturn += i;
            }
        }

        return toReturn;
    }
}