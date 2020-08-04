//https://www.hackerrank.com/challenges/insertionsort2/problem?isFullScreen=false
static void insertionSort2(int n, int[] arr) {
    int i = 1, j = 0, val = 0;
    while (i < n) {
        j = i - 1;
        val = arr[i];

        while(j >= 0 && arr[j] > val) {
            arr[j+1] = arr[j];
            j--;
        }
        
        arr[j+1] = val;
        i++;
        print(arr);
    }
}