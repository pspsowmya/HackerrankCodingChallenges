import java.util.ArrayList;
import java.util.List;

/**
 * There is a collection of input strings and a collection of query strings. For each query string,
 * determine how many times it occurs in the list of input strings. Return an array of the results.
 *
 * Example
 * strings = ['ab,'ab','abc']
 * queries = ['ab, 'abc','bc']
 *
 * There are 2 instances of 'ab', 1 of 'abc' and 0 of 'bc'.
 * For each query, add an element to the return array, results = [2,1,0]
 *
 * Function Description
 *
 * The matchingStrings function must return an array of integers
 * representing the frequency of occurrence of each query string in strings.
 *
 * matchingStrings has the following parameters:
 * string strings[n] - an array of strings to search
 * string queries[q] - an array of query strings
 *
 * Returns
 * int[q]: an array of results for each query
 *
 */
public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> countList = new ArrayList<>();
        int count =0;
        for(int i=0; i<=queries.size()-1;i++){
            for(int j=0;j<=strings.size()-1;j++){
                if(queries.get(i).equals(strings.get(j))){
                    count++;
                }

            }
            countList.add(count++);
            count = 0;
        }
        return countList;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        System.out.println(matchingStrings(strings,queries));
    }
}
