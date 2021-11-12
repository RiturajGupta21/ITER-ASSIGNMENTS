import sys
def PrimeCounter(n):
    if n <= 1 :
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True
n=int(sys.argv[1])
for i in range(2, n + 1):
    if PrimeCounter(i):
        print (i, end =" ")