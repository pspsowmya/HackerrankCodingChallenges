import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing
 * exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * <p>
 * Example
 * arr = [1,,3,5,7,9]
 * The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints 16 24
 * Function Description
 * Write a miniMaxSum function.
 * miniMaxSum has the following parameter(s):
 * arr: an array of 5 integers
 * Print
 * Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.
 * <p>
 * Input Format
 * A single line of five space-separated integers.
 * <p>
 * Output Format
 * Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated
 * by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
 */
public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        long sum = 0;
        long min = Collections.min(arr);
        long max = Collections.max(arr);

        for (int i = 0; i <= arr.size() - 1; i++) {
            if (arr.get(i) > min) {
                maxSum = maxSum + arr.get(i);
            }
            if (arr.get(i) < max) {
                minSum = minSum + arr.get(i);
            }
            if (arr.get(i) == min && arr.get(i) == max) {
                minSum = 4 * (arr.get(i));
                maxSum = 4 * (arr.get(i));
            }
        }
        System.out.println(minSum + " " + maxSum);

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        miniMaxSum(arr);
    }
}
