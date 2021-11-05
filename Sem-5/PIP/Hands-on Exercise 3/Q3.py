from math import sqrt
a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))
d = b**2 - 4*a*c
if d > 0:
    x1 = (((-b) + sqrt(d))/(2*a))     
    x2 = (((-b) - sqrt(d))/(2*a))
    print("2 roots are -> %f and %f" % (x1, x2))
elif d == 0:
    x = (-b) / 2*a
    print("1 root: ", x)
else:
    print("No roots, discriminant < 0.")