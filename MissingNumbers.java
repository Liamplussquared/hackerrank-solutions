// https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        
        // read in input, fill arrays
        int size = sc.nextInt();
        int arr[] = makeArr(size); // O(n)
        size = sc.nextInt();
        int brr[] = makeArr(size); // O(n)

        // sort to make printing in ascending order easier
        Arrays.sort(arr); // O(nlogn)
        Arrays.sort(brr); // O(nlogn)

        // keys are integers in arrays, values are number of occurences
        LinkedHashMap<Integer, Integer> aMap = makeMap(arr); // O(n)
        LinkedHashMap<Integer, Integer> bMap = makeMap(brr); // O(n)

        // find missing elements
       for (int key : bMap.keySet()) {
           if (!aMap.containsKey(key)) {
               System.out.print(key + " ");
           }
           else {
               if(aMap.get(key) < bMap.get(key)) {
                   System.out.print(key + " ");
               }
           }
       }

    }

    public static LinkedHashMap<Integer, Integer> makeMap(int a[]) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(); // linked to preserve insertion order

        for (int n : a) {
            if (map.containsKey(n)) 
                map.put(n, map.get(n)+1);
            else 
                map.put(n, 1);
        }
        return map;
    }

    public static int[] makeArr(int size) {
        int temp[] = new int[size];
        for(int i = 0; i < size; i++) {
            temp[i] = sc.nextInt();
        }
        return temp;
    }
}