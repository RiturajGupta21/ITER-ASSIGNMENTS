import math
n=int(input("Enter n -> "))
f= 0
for i in range (2,int(math.sqrt(n)+1)):
    if(n%i==0):
        f=1
        break
if f==0:
    print("The number is prime")
else:
    print("The number is not prime ")