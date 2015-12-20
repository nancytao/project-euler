/**
 * An irrational decimal fraction is created by concatenating the positive integers: If dn
 * represents the nth digit of the fractional part, find the value of the following expression:
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000.
 *
 * @author Nancy Tao
 * @version 12/19/2015
 */
public class Problem40 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 1000000; i++) {
            sb.append(i);
        }

        int prod = 1;
        for (int i = 1; i <= 1000000; i *= 10) {
            prod *= sb.charAt(i - 1) - '0';
        }
        System.out.print(prod);
    }
}