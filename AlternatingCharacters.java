// https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings&isFullScreen=true
import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // read in number of queries
        int n = sc.nextInt();
        String input = new String();
        
        // O(n)
        while(n > 0) {
            input = sc.next();
            alternatingCharacters(input);
            n--;
        }
    }

    public static void alternatingCharacters(String input) {
        int count = 0;
        // O(n)
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1))
                count++;
        }
        System.out.println(count);
    }
}