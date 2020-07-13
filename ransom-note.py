# https://www.hackerrank.com/challenges/ctci-ransom-note/problem

input()
mag = input().split()
note = input().split()

mag.sort()
note.sort()

flag = True

for word in note:
    if word not in mag:
        print("No")
        flag = False
        break
    else:
        mag.pop(mag.index(word))

if flag:
    print("Yes")