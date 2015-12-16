/**
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many
 * letters would be used? Do not count spaces or hyphens. The use of "and" when writing out numbers
 * is in compliance with British usage.
 *
 * @author Nancy Tao
 * @version 12/16/2015
 */
public class Problem17 {
    static String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    static String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        int letterCount = 0;
        for (int i = 1; i <= 1000; i++) {
            letterCount += inWords(i).length();
        }

        System.out.println(letterCount);
    }

    public static String inWords(int number) {
        if (number < 10) {
            return ONES[number];
        } else if (number < 20) {
            return TEENS[number - 10];
        } else if (number < 100) {
            return TENS[number / 10] + ONES[number % 10];
        } else {
            String toReturn = "";
            if (number >= 1000) {
                toReturn += inWords(number / 1000) + "thousand";
            }
            if (number / 100 % 10 != 0) {
                toReturn += ONES[number / 100 % 10] + "hundred";
            }
            if (number % 100 != 0) {
                toReturn += "and" + inWords(number % 100);
            }

            return toReturn;
        }
    }
}