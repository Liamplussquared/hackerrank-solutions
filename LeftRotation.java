https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D%5B%5D=arrays
public static int[] rotLeft(int[] a, int d) {
    d = d % a.length;
    if (d == 0) {
        return a;
    }

    int[] to_right = Arrays.copyOfRange(a, 0, d);
    int[] to_left = Arrays.copyOfRange(a, d, a.length);
    int[] b = ArrayUtils.addAll(to_left, to_right);

    return b;
}
