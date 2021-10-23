def collinear(x1, y1, x2, y2, x3, y3):
    a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) 
    if (a == 0):
        return(True)
    else:
        return(False)
x1, x2, x3, y1, y2, y3 = float(input("Enter x1 ")), float(input("Enter x2 ")), float(input("Enter x3 ")), float(input("Enter y1 ")), float(input("Enter y2 ")), float(input("Enter y3 "))
print(collinear(x1, y1, x2, y2, x3, y3))