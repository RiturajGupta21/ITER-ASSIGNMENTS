n=int(input("Enter n -> "))
t1=0
t2=1
c=2
print("Fibonacci Series ")
while(c<n):
    print(t1,t2,end=" ")
    t1=t1+t2
    t2=t1+t2
    c=c+2
if c==n:
    print(t1,t2,end=" ")
else:
    print(t1)