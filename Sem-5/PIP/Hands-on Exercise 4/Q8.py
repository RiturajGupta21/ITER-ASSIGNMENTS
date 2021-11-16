import math
x=float(input("Enter the value of x for taylor series expansion -> "))
term=1
sum=1
error= 0.000001
i=0
while((math.fabs(term))>error):
    i=i+1
    term=(x/i)*term
    sum=sum+term
print("The solution of Taylor series is = ",sum)
print(math.exp(x))