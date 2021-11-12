n=int(input("Enter n -> "))
t1=0
t2=1
print("Fibonacci Series ")
for i in range(n):
    print(t1,end=" ")
    sum=t1+t2
    t1=t2
    t2=sum