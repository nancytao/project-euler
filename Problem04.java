/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author Nancy Tao
 * @version 11/07/2015
 */
public class Problem04 {
    public static void main(String[] args) {
        int[] palindromeInfo = new Problem04().largestPalindrome();
        System.out.println(palindromeInfo[0] + " times " + palindromeInfo[1] + " equals " + palindromeInfo[2]);
    }

    public int[] largestPalindrome() {
        int factorOne = -1;
        int factorTwo = -1;
        int largestPalindrome = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(String.valueOf(product)) && product > largestPalindrome) {
                    largestPalindrome = product;
                    factorOne = i;
                    factorTwo = j;
                }
            }
        }

        int[] toReturn = new int[] {factorOne, factorTwo, largestPalindrome};

        return toReturn;
    }

    public boolean isPalindrome(String num) {
        String reverse = new StringBuilder(num).reverse().toString();
        return num.equals(reverse);
    }
}