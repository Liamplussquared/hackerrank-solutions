//https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=false
static int[] matchingStrings(String[] strings, String[] queries) {
    // declare array of results
    int results[] = new int[queries.length];
    String q = new String();

    // declare and initalise HashMap of input strings
    HashMap<String, Integer> strs = new HashMap<String, Integer>();
    for (String s : strings) {
        if (strs.containsKey(s)) {
            strs.put(s, strs.get(s) + 1);
        }
        else {
            strs.put(s, 1);
        }
    }

    for (int i = 0; i < queries.length; i++) {
        q = queries[i];
        if (strs.containsKey(q)) {
            results[i] = strs.get(q);
        }
        else {
            results[i] = 0;
        }
    }

    return results;
}