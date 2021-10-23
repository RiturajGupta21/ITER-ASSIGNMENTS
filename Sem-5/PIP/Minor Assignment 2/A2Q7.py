def  areaTriangle(side1,side2,side3):
    assert (side1 + side2 <= side3) or (side1 + side3 <= side2) or (side2 + side3 <= side1)
    s = (side1 + side2 + side3) / 2  
    return (s*(s-side1)*(s-side2)*(s-side3)) ** 0.5  
if __name__=='__main__':
    side1,side2,side3=float(input('Enter length of side 1: ')),float(input('Enter length of side 2: ')),float(input('Enter length of side 3: '))
    print(areaTriangle(side1,side2,side3))