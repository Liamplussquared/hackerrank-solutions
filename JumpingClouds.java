static int jumpingOnClouds(int[] c) {
    int i = 0;
    int jumps = 0;
    int len = c.length;
    while (i < len-1) {
        // can jump two clouds
        if (i+2 < len && c[i+2]==0) {
            i += 2;
            jumps++;
        }
        // must jump to next cloud
        else {
            i++;
            jumps++;
        }
    }
    return jumps;
}