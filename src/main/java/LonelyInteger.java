/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *
 * Example
 * a=[1,2,3,4,3,2,1]
 * The unique element is 4.
 *
 * Function Description
 * Write the lonelyinteger function in the editor below.
 * lonelyinteger has the following parameter(s):
 * int a[n]: an array of integers
 *
 * Returns
 * int: the element that occurs only once
 *
 * Input Format
 * The first line contains a single integer, n, the number of integers in the array.
 * The second line contains n space-separated integers that describe the values in a.
 *
 * Constraints
 * 1<=n<=100
 * It is guaranteed that n is an odd number and that there is one unique element.
 * 0<=a[i]<=100, where 0<=i<=n
 *
 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {
        int lonelyInteger = 0;
        List uniqueList =
                a.stream().collect(Collectors.groupingBy(Function.identity()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue().size() == 1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
        lonelyInteger = (int)uniqueList.get(0);

        return lonelyInteger;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        System.out.println(lonelyInteger(a));
    }
}
