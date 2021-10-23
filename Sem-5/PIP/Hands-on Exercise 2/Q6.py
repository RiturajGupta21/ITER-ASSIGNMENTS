import math as m
x1=float(input())
y1=float(input())
x2=float(input())
y2=float(input())
x3=float(input())
y3=float(input())
a=m.sqrt((pow((x2-x1), 2))+(pow((y2-y1), 2)));
b=m.sqrt((pow((x3-x2), 2))+(pow((y3-y2), 2)));
c=m.sqrt((pow((x3-x1), 2))+(pow((y3-y1), 2)));
x=(a+b+c)/2
area=m.sqrt(x*(x-a)*(x-b)*(x-c))
print("Area= %.2f"% area)
