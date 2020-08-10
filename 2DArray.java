// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays&isFullScreen=true
static int hourglassSum(int[][] arr) {
    int mx = Integer.MIN_VALUE, glass = 0;

    for(int i = 0; i < arr.length-2; i++) {
        for (int j = 0; j < arr.length-2; j++) {
                glass = glass(arr, i, j);
                mx = Math.max(glass,mx);
        }
    }
    return mx;
}

static int glass(int[][] arr, int i, int j) {
    int tmp = 0;
    tmp += arr[i][j] + arr[i][j+1] + arr[i][j+2];
    tmp += arr[i+1][j+1];
    tmp += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
    return tmp;
}
