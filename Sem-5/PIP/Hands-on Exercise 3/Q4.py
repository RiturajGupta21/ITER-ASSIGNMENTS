a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))
d = float(input("d: "))
e = float(input("e: "))
f = float(input("f: "))
x=((e*d)-(b*f))/((a*d)-(b*c))
y=((a*f)-(e*c))/((a*d)-(b*c))
if((a*d)-(b*c)!=0):
    print("x is ",x, " and y is ",y)
else:
    print("no solution")