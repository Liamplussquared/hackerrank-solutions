//https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> stack = new LinkedList<Integer>();

        int numQueries = sc.nextInt();
        int q = 0; 
        int item = 0;

        for(int i = 0; i < numQueries; i++) {
            q = sc.nextInt();
            // inserting an element
            if (q == 1) {
                item = sc.nextInt();
                if (!stack.isEmpty()) {
                    item = Math.max(item, stack.peek());
                }
                stack.push(item);
            }
            // popping from stack
            else if (q == 2) {
                stack.pop();
            }
            // top of stack is always the biggest element
            else if (q == 3) {
                System.out.println(stack.peek());
            }
        }
    }
}
