//https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=false
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPanagram(s.toLowerCase()));
    }

    public static String isPanagram(String s) {
        
        s = s.replaceAll(" ", "");
        // create hashmap of alphabet, initialise every letter to 0 occurences
        HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
        String  alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < alphabet.length(); i++) {
            occurences.put(alphabet.charAt(i), 0);
        }

        // loop through input string and count occurences of letters
        for(int i = 0; i < s.length(); i++) {
            occurences.put(s.charAt(i), occurences.get(s.charAt(i))+1);
        }

        // loop throug Hashmap and return "not a pangram" if any occurence is zero
        for(int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);
            if (occurences.get(letter)==0)
                return "not pangram";
        }

        return "pangram";
    }
}
