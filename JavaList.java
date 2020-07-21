// https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // fill arraylist
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        int num_queries = sc.nextInt();
        String command = new String();
        int pos, ele;
        for (int i = 0; i < num_queries; i++) {
            command = sc.next();
            if (command.equals("Insert")) {
                pos =  sc.nextInt();
                ele = sc.nextInt();
                arr.add(pos, ele);
            }
            else if (command.equals("Delete")) {
                pos = sc.nextInt();
                arr.remove(pos);
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}