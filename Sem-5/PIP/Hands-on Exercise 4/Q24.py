m=int(input("Enter m -> "))
n=int(input("Enter n -> "))
t=n
s1=0
s2=0
for i in range(1,t):
    if t%i==0:
        s1=s1+i
t=m
for i in range(1,t):
    if t%i==0:
        s2=s2+i
if s1==m and s2==n:
    print("Amicable Number")
else:
    print("Not Amicable")