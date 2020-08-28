#https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=false
def main(): 
    t = int(input())

    while t > 0:
        nums = [int(i) for i in input().split()]
        p = nums[0]
        s = nums[1]
        c = nums[2]
        get_number(p, s, c)
        t -= 1
        

def get_number(p, s, c):
    print (((c-1 + s-1) % p) + 1)


if __name__ == '__main__':
    main()
    