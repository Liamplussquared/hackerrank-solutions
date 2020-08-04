//https://www.hackerrank.com/challenges/countingsort1/problem?isFullScreen=true
static int[] countingSort(int[] arr) {
    int counts[] = new int[100];

    for(int i = 0; i < arr.length; i++) {
        counts[arr[i]]++;
    }

    return counts;

}