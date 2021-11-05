import math
x=float(int(input("Enetr the x coordinate -> ")))
y=float(int(input("Enetr the y coordinate -> ")))
c=math.sqrt((x**2)+(y**2))
if(c>10):
    print("Point (",x,",",y,") is not in the circle")
else:
    print("Point (",x,",",y,") is in the circle")
