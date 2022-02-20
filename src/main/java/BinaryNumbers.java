/**
 * Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 integer denoting
 * the maximum number of consecutive 1's in n's binary representation.
 * When working with different bases, it is common to show the base as a subscript.
 *
 * Example
 * n = 125
 * The binary representation of 125 is 1111101. In base 10, there are 5 and 1 consecutive ones in two groups.
 * Print the maximum,5.
 *
 * Input Format
 * A single integer, n.
 *
 * Constraints
 * 1<=n<=10^6
 *
 * Output Format
 * Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of n.
 *
 */
public class BinaryNumbers {

    public int maxConsecutiveCount(int n){
        String s = Integer.toBinaryString(n);
        int count = 1;
        int max=0;
        for(int i=0;i<=s.length()-2;i++){
            if(Character.getNumericValue(s.charAt(i))==1 && Character.getNumericValue(s.charAt(i+1))==1){
                count++;
            }
            else if(Character.getNumericValue(s.charAt(i+1)) == 0) {
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BinaryNumbers numbers = new BinaryNumbers();
        System.out.println(numbers.maxConsecutiveCount(43));
    }
}
