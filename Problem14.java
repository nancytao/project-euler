import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *     n → n/2 (n is even)
 *     n → 3n + 1 (n is odd)
 * Although it has not been proved yet, it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 *
 * @author Nancy Tao
 * @version 12/13/2015
 */
public class Problem14 {
    static Map<Integer, Integer> collatzChains;

    public static void main(String[] args) {
        collatzChains = new HashMap<Integer, Integer>(); //maps starting number to length

        generateCollatzChainMap(1000000);

        //find max value and associated key (starting number)
        System.out.println(Collections.max(collatzChains.entrySet(),
                (e1, e2) -> e1.getValue() - e2.getValue()).getKey());
    }

    private static void generateCollatzChainMap(int max) {
        for (int i = 1; i < 1000000; i++) {
            long num = i; //set starting number
            int chainLength = 1; //because it never gets the length of 1 once it reaches 1
            while (num != 1) {
                if (collatzChains.containsKey(num)) {
                    chainLength += collatzChains.get(num);
                    num = 1;
                } else if (num % 2 == 0) {
                    num = num / 2;
                    chainLength++;
                } else {
                    num = 3 * num + 1;
                    chainLength++;
                }
            }

            collatzChains.put(i, chainLength);
        }
    }
}