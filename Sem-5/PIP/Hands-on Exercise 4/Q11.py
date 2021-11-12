n=int(input("Enter n -> "))
res=0
while(n > 0):
    temp = n % 10
    res = res * 10 + temp
    n = n // 10
print(res)