import math
a = int(input("Enter a "))
b = int(input("Enter b "))
c = int(input("Enter c "))
d = (b**2) - (4*a*c)
root1 = (-b-math.sqrt(d))/(2*a)
root2 = (-b+math.sqrt(d))/(2*a)
print('The solution are {} and {}'.format(root1,root2))

x = int(input("Enter x "))
y = int(input("Enter y "))
result=(((2*x*y)-(9*y))/(2*x*(y**3)))-((4*y*(x**2))-(2*y))
print(result)

x = int(input("Enter x "))
y = int(input("Enter y "))
v = int(input("Enter v "))
result=(2*math.cos(0.5*(x+y))*math.cos(0.5*(x-y)))+math.e**x-1+(x/4)+math.tan(x)-math.log(v)