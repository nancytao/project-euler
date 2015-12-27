import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * For a number written in Roman numerals to be considered valid there are basic rules which must be
 * followed. Even though the rules allow some numbers to be expressed in more than one way there is
 * always a "best" way of writing a particular number. For example, according to the rules only
 * XIIIIII and XVI are valid, and the last example is considered to be the most efficient, as it
 * uses the least number of numerals. The text file contains one thousand numbers written in valid,
 * but not necessarily minimal, Roman numerals. Find the number of characters saved by writing each
 * of these in their minimal form.
 *
 * @author Nancy Tao
 * @version 12/26/2015
 */
public class Problem89 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("p089_roman.txt"));
        int difference = 0;

        while (sc.hasNextLine()) {
            String originalNum = sc.nextLine();
            difference += originalNum.length() - optimize(originalNum).length();
        }

        System.out.print(difference);
    }

    private static String optimize(String original) {
        return original.replaceAll("IIII", "IV").replaceAll("XXXX", "XL")
                       .replaceAll ("CCCC", "CD").replaceAll("LXL", "XC")
                       .replaceAll ("DCD", "CM").replaceAll("VIV", "IX");
    }
}