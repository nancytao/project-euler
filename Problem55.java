import java.math.BigInteger;

/**
 * If we take 47, reverse and add, 47 + 74 = 121, which is palindromic. Although no one has proved
 * it yet, it is thought that some numbers, like 196, never produce a palindrome. A number that
 * never forms a palindrome through the reverse and add process is called a Lychrel number. Due to
 * the theoretical nature of these numbers, and for the purpose of this problem, we shall assume
 * that a number is Lychrel until proven otherwise. In addition you are given that for every number
 * below ten-thousand, it will either (i) become a palindrome in less than fifty iterations, or,
 * (ii) no one, with all the computing power that exists, has managed so far to map it to a
 * palindrome. Surprisingly, there are palindromic numbers that are themselves Lychrel numbers; the
 * first example is 4994. How many Lychrel numbers are there below ten-thousand?
 *
 * @author Nancy Tao
 * @version 12/22/2015
 */
public class Problem55 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i < 10000; i++) {
            if (isLychrel(i)) {
                counter++;
            }
        }

        System.out.print(counter);
    }

    private static boolean isLychrel(int num) {
        BigInteger temp = BigInteger.valueOf(num);
        for (int i = 0; i < 50; i++) {
            temp = temp.add(new BigInteger(reverse(temp)));
            if (isPalindrome(temp)) {
                return false;
            }
        }

        return true;
    }

    private static String reverse(BigInteger num) {
        return new StringBuilder(num.toString()).reverse().toString();
    }

    private static boolean isPalindrome(BigInteger num) {
        return num.equals(new BigInteger(reverse(num)));
    }
}