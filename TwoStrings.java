// https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D%5B%5D%5B%5D=dictionaries-hashmaps
import java.util.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        // create hashmap of characters in first string
        Set<Character> subs = new HashSet<Character>();

        // add all characters of first string to hashmap
        for(int i = 0; i < s1.length(); i++) {
            subs.add(s1.charAt(i));
        }

        // iterate through second string and return true if any character is found in the hashmap
        for(int i = 0; i < s2.length(); i++){
            if (subs.contains(s2.charAt(i))) {
                return "YES";
            }
        }

        // else return false
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String result = twoStrings(s1, s2);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
