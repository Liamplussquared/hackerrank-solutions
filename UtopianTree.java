//https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true
static int utopianTree(int n) {
    int total = 1;

    for(int i = 0; i < n; i++) {
        if (i % 2 != 0) {
            total++;
        }
        else {
            total = total * 2;
        }
    }
    return total;
}