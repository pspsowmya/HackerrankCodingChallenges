/**
 * Given a 6x6 2D Array, A:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * We define an hourglass in A to be a subset of values with indices falling
 * in this pattern in A's graphical representation:
 * a b c
 *   d
 * e f g
 *
 * There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 *
 * Task
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 *
 * Example
 * In the array shown above, the maximum hourglass sum is 7 for the hourglass in the top left corner.
 *
 * Input Format
 * There are 6 lines of input, where each line contains 6 space-separated integers that describe the 2D Array A.
 *
 * Constraints
 * -9<=A[i][j]<=9
 * 0<=i,j<=5
 *
 * Output Format
 * Print the maximum hourglass sum in A.
 *
 */
import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArrays {
    static int max;

    public static int getMaxGlassHourSum(List<List<Integer>> arr) {
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                sum = sum + arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (i == 0 && j == 0) {
                    max = sum;
                }
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //Creating a 6X6 array
        List<List<Integer>> arr = new ArrayList<>();

        //Adding elements into a 6X6 array
        List<Integer> arrRowItems1 = new ArrayList<>();
        arrRowItems1.add(0);
        arrRowItems1.add(-4);
        arrRowItems1.add(-6);
        arrRowItems1.add(0);
        arrRowItems1.add(-7);
        arrRowItems1.add(-6);
        arr.add(arrRowItems1);

        List<Integer> arrRowItems2 = new ArrayList<>();
        arrRowItems2.add(-1);
        arrRowItems2.add(-2);
        arrRowItems2.add(-6);
        arrRowItems2.add(-8);
        arrRowItems2.add(-3);
        arrRowItems2.add(-1);
        arr.add(arrRowItems2);

        List<Integer> arrRowItems3 = new ArrayList<>();
        arrRowItems3.add(-8);
        arrRowItems3.add(-4);
        arrRowItems3.add(-2);
        arrRowItems3.add(-8);
        arrRowItems3.add(-8);
        arrRowItems3.add(-6);
        arr.add(arrRowItems3);

        List<Integer> arrRowItems4 = new ArrayList<>();
        arrRowItems4.add(-3);
        arrRowItems4.add(-1);
        arrRowItems4.add(-2);
        arrRowItems4.add(-5);
        arrRowItems4.add(-7);
        arrRowItems4.add(-4);
        arr.add(arrRowItems4);

        List<Integer> arrRowItems5 = new ArrayList<>();
        arrRowItems5.add(-3);
        arrRowItems5.add(-5);
        arrRowItems5.add(-3);
        arrRowItems5.add(-6);
        arrRowItems5.add(-6);
        arrRowItems5.add(-6);
        arr.add(arrRowItems5);

        List<Integer> arrRowItems6 = new ArrayList<>();
        arrRowItems6.add(-3);
        arrRowItems6.add(-6);
        arrRowItems6.add(0);
        arrRowItems6.add(-8);
        arrRowItems6.add(-6);
        arrRowItems6.add(-7);
        arr.add(arrRowItems6);

        //Retrieving elements from a 6X6 array
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(getMaxGlassHourSum(arr));
    }
}
