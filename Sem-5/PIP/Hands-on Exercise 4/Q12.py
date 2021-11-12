n=int(input("Enter n -> "))
g1=0
g2=n/2
while (1):
    g1=g2
    g2=(g1+(n/g1))/2
    if(abs(g1-g2)<0.000001):
        break
print("The root of ", n," is =",g2)