// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D%5B%5D%5B%5D=strings
public static int makeAnagram(String a, String b) {
    HashMap<Character, Integer> aMap = makeMap(a);
    HashMap<Character, Integer> bMap = makeMap(b);

    int count = 0, value = 0;
    char key;
    // iterate through hashmap
    for(Map.Entry<Character, Integer> entry : aMap.entrySet()) {
        key = entry.getKey();
        value = entry.getValue();
        
        // account for what bMap is missing
        if (!bMap.containsKey(key)) {
            count += value;
        }
        // account for difference between number of occurences 
        else {
            count += Math.abs(value - bMap.get(key));
        }
    }

    // account for what a is missing
    for(Map.Entry<Character, Integer> entry : bMap.entrySet()) {
        key = entry.getKey();
        value = entry.getValue();

        if (!aMap.containsKey(key)) {
            count += value;
        }
    }

    return count;

}

public static HashMap<Character, Integer> makeMap(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    char c;
    for (int i = 0; i < s.length(); i ++) {
        c = s.charAt(i);
        if(map.containsKey(c)) {
            map.put(c, map.get(c)+1);
        }
        else {
            map.put(c, 1);
        }
    }
    return map;
}