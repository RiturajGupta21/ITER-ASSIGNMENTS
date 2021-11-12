import math
p=float(input("Enter the value of p for the expansion of cos p -> "))
x=math.radians(p)
i=0
error=0.000001
term=1
tcos=1
while((math.fabs(term))>error):
    i=i+2
    term=(-term*x*x)/((i-1)*i)
    tcos=tcos+term
print("The infinite series expansion solution is = ",tcos)