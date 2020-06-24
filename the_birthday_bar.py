 #!/bin/python3

import math
import os
import random
import re
import sys

# Should use prefix sum for efficieny, passed the test-cases as is tho
def birthday(s, d, m):
    """
    s is list of integers, numbers on chocolate squares
    d is Ron's birth day 1<=d<=31
    m is Ron's birth-month 1<=m<=12
    Return how many contiguous segments of length m sum to d 
    """
    count = 0

    if len(s) < m:
        return 0
    
    # Slide through, O(n)
    for i in range(len(s)-m+1):
        if sum(s[i:i+m]) == d:
            count += 1
    
    return count


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input().strip())
    s = list(map(int, input().rstrip().split()))
    dm = input().rstrip().split()
    d = int(dm[0])
    m = int(dm[1])
    result = birthday(s, d, m)
    fptr.write(str(result) + '\n')
    fptr.close()
