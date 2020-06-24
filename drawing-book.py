import os
import sys

def pageCount(n, p):
    """
    n,p are two integers. n represents number of pages, p the desired page number
    function returns minimum necessary page turns
    """
    return min(p//2, n//2-p//2)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input())
    p = int(input())
    result = pageCount(n, p)
    fptr.write(str(result) + '\n')
    fptr.close()
