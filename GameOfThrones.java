// https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true
import java.util.Scanner;
import java.util.HashMap;

public class GameOfThrones {
    public static void main(String args[]) {
        boolean flag = checkPalindrome();
        if (!flag) 
            System.out.println("YES");
        else 
            System.out.println("NO");
    }

    public static boolean checkPalindrome () {
        Scanner sc = new Scanner(System.in);
        // Read in input
        String s = sc.next();
        sc.close();

        // declare HashMap of characters
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // fill HashMap
        char c;
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }

        int oddCount = 0;
        
        for (char d : map.keySet()) {
            if(map.get(d) % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return true; 
                }
            }
        }
        return false;
    }
}