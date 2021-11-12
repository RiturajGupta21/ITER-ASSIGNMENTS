import math
x=float(input("Enter the value of x for taylor series expansion -> "))
term=x
sum=1+x
error= 0.000001
i=2
while((math.fabs(term))>error):
    term=term*x/((i-1)*i)
    sum=sum+term
    i=i+2
print("The solution of Taylor series is = ",sum)