import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Using p022_names.txt, a 46K text file containing over five-thousand first names, begin by sorting
 * it into alphabetical order. Then working out the alphabetical value for each name, multiply this
 * value by its alphabetical position in the list to obtain a name score. What is the total of all
 * the name scores in the file?
 *
 * @author Nancy Tao
 * @version 12/16/2015
 */
public class Problem22 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("p022_names.txt")).useDelimiter(",");
        List<String> nameList = new ArrayList<>();

        while (sc.hasNext()) {
            nameList.add(sc.next().replace("\"", ""));
        }

        Collections.sort(nameList);

        int sum = 0;
        for (int i = 1; i <= nameList.size(); i++) {
            int nameSum = 0;
            for (int j = 0; j < nameList.get(i - 1).length(); j++) {
                nameSum += nameList.get(i - 1).charAt(j) - 'A' + 1;
            }

            sum += nameSum * i;
        }

        System.out.print(sum);
    }
}