def gcd(m, n):
    if (m == 0):
        return n
    if (n == 0):
        return m
    if (m == n):
        return m
    if (m > n):
        return gcd(m-n, n)
    return gcd(m, n-m)
m = int(input("Enter number m: "))
n = int(input("Enter number n: "))
print("The G.C.D. is", gcd(m, n))