/* For some stupid reason the main method and imports were locked, hence why code is so ugly
https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true */
public static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    int count = 0;
    char key;
    java.util.HashMap<Character, Integer> freqA = new java.util.HashMap<Character, Integer>();
    java.util.HashMap<Character, Integer> freqB = new java.util.HashMap<Character, Integer>();

    for(int i = 0; i < a.length(); i++) {
        key = a.charAt(i);
        if(freqA.containsKey(key)) {
            count = freqA.get(key);
            freqA.put(key, count + 1);
        }
        else {
            freqA.put(key, 1);
        }
    }

      for(int i = 0; i < b.length(); i++) {
        key = b.charAt(i);
        if(freqB.containsKey(key)) {
            count = freqB.get(key);
            freqB.put(key, count + 1);
        }
        else {
            freqB.put(key, 1);
        }
    }
    return freqA.equals(freqB);
    
}