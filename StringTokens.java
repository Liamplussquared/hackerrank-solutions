//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // remove spaces at either ends
        s = s.trim();
        if (s.length() > 0) {
            // split by non-alphabetical characters
            String[] tokens = s.split("[ !,?.\\_'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        else System.out.println(0);
        scan.close();
    }
}

