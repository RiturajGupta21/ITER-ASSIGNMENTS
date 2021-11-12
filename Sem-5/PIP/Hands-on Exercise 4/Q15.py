m=int(input("Enter m -> "))
n=int(input("Enter n -> "))
r=1
while r>0:
    r=n%m
    n=m
    m=r
print("GCD of the numbers",n)
