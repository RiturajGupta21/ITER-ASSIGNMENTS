n=int(input("Enter n -> "))
for i in range(2,n+1):
    if n%i==0:
        print("Smallest divisor = ",i)
        break