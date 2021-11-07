import math
# a
def seriesa(x,n):
    res = 1
    pos = 1
    temp = 2
    for i in range(1,n):
        fact = 1
        for j in range(1,temp+1):
            fact = fact * j
        pos = pos * (-1)
        m = pos * math.pow(x, temp) / fact
        res = res + m
        temp += 2
    return res

def seriesb(x,n):
    res = 1.0
    for i in range(n, 0, -1):
        res = 1 + x * res / i
    return res

x = int(input("Enter the value of x: "))
n = int(input("Enter the value of n: "))
print(seriesa(x,n))
print(seriesb(x,n))