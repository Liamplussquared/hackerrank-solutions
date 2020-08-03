// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
static String catAndMouse(int x, int y, int z) {
    int diff1 = Math.abs(z - x);
    int diff2 = Math.abs(z - y);

    if (diff1 > diff2) return "Cat B";
    else if (diff1 < diff2) return "Cat A";
    else return "Mouse C";
}