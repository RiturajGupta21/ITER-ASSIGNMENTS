import math
p=float(input("Enter the value of p for the expansion of sin p -> "))
x=math.radians(p)
i=1
error=0.000001
term=x
tsin=x
while((math.fabs(term))>error):
    i=i+2
    term=(-term*x*x)/((i-1)*i)
    tsin=tsin+term
print("The infinite series expansion solution is = ",tsin)