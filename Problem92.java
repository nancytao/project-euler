/**
 * A number chain is created by continuously adding the square of the digits in a number to form a
 * new number until it has been seen before. For example,
 *     44 → 32 → 13 → 10 → 1 → 1
 *     85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89
 * Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most
 * amazing is that EVERY starting number will eventually arrive at 1 or 89. How many starting
 * numbers below ten million will arrive at 89?
 *
 * @author Nancy Tao
 * @version 12/25/2015
 */
public class Problem92 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 10000000; i++) {
            if (endsIn89(i)) {
                counter++;
            }
        }

        System.out.println(counter);
    }

    private static boolean endsIn89(int num) {
        if (num == 1) {
            return false;
        } else if (num == 89) {
            return true;
        } else {
            int sum = 0;
            while (num != 0) {
                sum += (num % 10) * (num % 10);
                num = num / 10;
            }

            return endsIn89(sum);
        }
    }
}