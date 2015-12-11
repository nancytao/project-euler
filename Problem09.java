/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * @author Nancy Tao
 * @version 12/11/2015
 */
public class Problem09 {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;

                if (a * a + b * b == c * c) {
                    System.out.println(a * b * c);
                }
            }
        }
    }
}