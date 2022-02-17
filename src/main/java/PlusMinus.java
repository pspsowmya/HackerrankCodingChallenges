import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 * <p>
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 * though answers with absolute error of up to  are acceptable.
 * <p>
 * Example
 * arr = [1,1,0,-1,-1]
 * There are n=5 elements, two positive, two negative and one zero. Their ratios are 2/5=0.400000 , 2/5=0.400000, and
 * 1/5=0.200000.
 * Results are printed as:
 * 0.400000
 * 0.400000
 * 0.200000
 * <p>
 * Function Description
 * Write a plusMinus function
 * <p>
 * plusMinus has the following parameter(s):
 * int arr[n]: an array of integers
 * Print
 * Print the ratios of positive, negative and zero values in the array.
 * Each value should be printed on a separate line with 6 digits after the decimal. The function should not return a value.
 * <p>
 * Input Format
 * The first line contains an integer, n, the size of the array.
 * The second line contains  space-separated integers that describe arr[n].
 * <p>
 * Output Format
 * Print the following  lines, each to  decimals:
 * proportion of positive values
 * proportion of negative values
 * proportion of zeros
 */

public class PlusMinus {
    public static int countPositiveNumbers = 0;
    public static int countNegativeNumbers = 0;
    public static int countZeroes = 0;

    public static void plusMinus(List<Integer> arr) {
        int numberOfElements = arr.size();

        for (int i = 0; i <= numberOfElements - 1; i++) {
            if (arr.get(i) > 0) {
                countPositiveNumbers++;
            } else if (arr.get(i) < 0) {
                countNegativeNumbers++;
            } else if (arr.get(i) == 0) {
                countZeroes++;
            }
        }
        DecimalFormat formatter = new DecimalFormat("#0.000000");
        System.out.println(formatter.format((double) countPositiveNumbers / numberOfElements));
        System.out.println(formatter.format((double) countNegativeNumbers / numberOfElements));
        System.out.println(formatter.format((double) countZeroes / numberOfElements));
    }

    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        PlusMinus.plusMinus(arr);
    }

}
