# O(n*m) solution not ideal, passes all test cases however.

def getMoneySpent(keyboards, drives, b):
    b_list = []
    for k in keyboards:
        for d in drives:
            if k + d <= b:
                b_list.append(k+d)

    if len(b_list) > 0: 
        return max(b_list)
    else:
        return -1