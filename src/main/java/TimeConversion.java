/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * Example
 *
 * s='12:01:00PM'
 * Return '12:01:00'.
 *
 * s='12:01:00AM'
 * Return '00:01:00'.
 *
 * Function Description
 * Write timeConversion.
 * It should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 * string s: a time in 12 hour format
 *
 * Returns
 * string: the time in 24 hour format
 *
 * Input Format
 * A single string s that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ss:PM).
 *
 * Constraints
 * All input times are valid
 */

public class TimeConversion {

    public static String timeConversion(String s) {
        String convertedTime = null;
        if (s.charAt(8) == 'A') {
            if (s.substring(0, 2).equals("12")) {
                convertedTime = "00" + s.substring(2, 8);
            } else {
                convertedTime = s.substring(0, 8);
            }
        } else if (s.charAt(8) == 'P') {
            if (s.substring(0, 2).equals("12")) {
                convertedTime = s.substring(0, 8);
            } else {
                int n = Integer.parseInt(s.substring(0, 2));
                n = n + 12;
                convertedTime = n + s.substring(2, 8);
            }
        }
        return convertedTime;
    }


    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00PM"));
        System.out.println(timeConversion("07:00:00PM"));
        System.out.println(timeConversion("12:45:00AM"));
        System.out.println(timeConversion("10:33:00AM"));
    }
}
