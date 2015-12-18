/**
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, for which
 * value of p ≤ 1000, is the number of solutions maximised?
 *
 * @author Nancy Tao
 * @version 12/18/2015
 */
public class Problem39 {

    public static void main(String[] args) {
        int maxTriangles = 0;
        int maxPerimeter = 0;

        for (int perimeter = 1; perimeter < 1000; perimeter++) {
            int numTriangles = countNumTriangles(perimeter);
            if (numTriangles > maxTriangles) {
                maxTriangles = numTriangles;
                maxPerimeter = perimeter;
            }
        }

        System.out.print(maxPerimeter);
    }

    public static int countNumTriangles(int perimeter) {
        int count = 0;

        for (int a = 1; a < perimeter; a++) {
            for (int b = a; b < perimeter; b++) {
                int c = perimeter - b - a;
                if (a * a + b * b == c * c) {
                    count++;
                }
            }
        }

        return count;
    }
}