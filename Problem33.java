/**
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to
 * simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling
 * the 9s. We shall consider fractions like, 30/50 = 3/5, to be trivial examples. There are exactly
 * four non-trivial examples of this type of fraction, less than one in value, and containing two
 * digits in the numerator and denominator. If the product of these four fractions is given in its
 * lowest common terms, find the value of the denominator.
 *
 * @author Nancy Tao
 * @version 12/17/2015
 */
public class Problem33 {

    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 1;

        for (int i = 11; i < 100; i++) { //numerator
            for (int j = i + 1; j < 100; j++) { //denominator
                if (digitCancels(i, j)) {
                    numerator *= i;
                    denominator *= j;
                }
            }
        }

        System.out.print(denominator / gcm(numerator, denominator));
    }

    public static boolean digitCancels(int numerator, int denominator) {
        double asDecimal = (double) numerator / (double) denominator;

        double numerator1stDigit = numerator / 10;
        double numerator2ndDigit = numerator % 10;

        double denominator1stDigit = denominator / 10;
        double denominator2ndDigit = denominator % 10;

        if (numerator2ndDigit == 0 || denominator2ndDigit == 0) {
            return false;
        } else if (numerator1stDigit == denominator2ndDigit
                && numerator2ndDigit / denominator1stDigit == asDecimal) {
            return true;
        } else if (numerator2ndDigit == denominator1stDigit
                && numerator1stDigit / denominator2ndDigit == asDecimal) {
            return true;
        } else {
            return false;
        }
    }

    public static int gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b);
    }
}