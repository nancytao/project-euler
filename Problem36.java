/**
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 *
 * @author Nancy Tao
 * @version 12/17/2015
 */
public class Problem36 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000000; i++) {
            if (isPalindrome(Integer.toString(i, 10)) && isPalindrome(Integer.toString(i, 2))) {
                sum += i;
            }
        }

        System.out.print(sum);
    }

    private static boolean isPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}