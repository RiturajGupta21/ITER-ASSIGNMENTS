def leftCirculate(lst, n):
    for i in range(0, n):
        first = lst[0]
        for j in range(0, len(lst)-1):
            lst[j] = lst[j+1]
        lst[len(lst)-1] = first


lst = [1, 2, 3, 4, 5]
n = 3
leftCirculate(lst, n)
print(lst)
