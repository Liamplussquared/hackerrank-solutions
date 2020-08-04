//https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true
static int viralAdvertising(int n) {
    int total = 5;
    int like = 0, totalL = 0;
    for(int i = 0; i < n; i++) {
        like = total / 2;
        total = like * 3;
        totalL += like;
    }
    return totalL;
}