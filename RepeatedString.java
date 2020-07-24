// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&h_r=next-challenge&h_v=zen&isFullScreen=false&playlist_slugs%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=warmup
static long repeatedString(String s, long n) {
    long repeat = n / s.length();
    int modulo = (int) (n % s.length());
    long numA = 0l;;

    // count occurences of 'a' in s
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a') {
            numA ++;
        }
    }

    // multiply by how many times s fully repeats
    numA *= repeat;
    s = s.substring(0, modulo);

    // add on however many a's appear in last addition
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a') {
            numA ++;
        }
    }

    return numA;
}