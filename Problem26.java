import java.util.HashSet;
import java.util.Set;

/**
 * Find the value of d (less than 1000) for which 1/d contains the longest recurring cycle in its
 * decimal fraction part.
 *
 * @author Nancy Tao
 * @version 12/16/2015
 */
public class Problem26 {

    public static void main(String[] args) {
        int maxLength = 0;
        int bestNum = 0;

        for (int i = 2; i < 1000; i++) {
            if (cycleLength(i) > maxLength) {
                maxLength = cycleLength(i);
                bestNum = i;
            }
        }

        System.out.println(bestNum);
    }

    /**
     * Counts how many times you can divide a factor of 10 by the number before the remainder starts
     * repeating
     * @param  denominator number to divide by
     * @return             the length of the recurring cycle
     */
    public static int cycleLength(int denominator) {
        int numerator = 1;
        while (numerator < denominator) {
            numerator *= 10;
        }

        Set<Integer> listOfRemainders = new HashSet<>();
        listOfRemainders.add(numerator);

        int remainder = 0;

        while (true) {
            remainder = numerator % denominator;

            if (remainder != 0) {
                while (remainder < denominator) {
                    remainder *= 10;
                }

                if (!listOfRemainders.add(remainder)) {
                    return listOfRemainders.size();
                } else {
                    numerator = remainder;
                }
            } else {
                return listOfRemainders.size();
            }
        }
    }
}