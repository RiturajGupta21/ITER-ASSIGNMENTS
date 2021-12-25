def findStrictlyIncreasingNum(start, out, n):
    if (n == 0):
        print(out, end = " ")
        return
    for i in range(start, 10):
        str1 = out + str(i)
        findStrictlyIncreasingNum(i + 1,str1, n - 1)