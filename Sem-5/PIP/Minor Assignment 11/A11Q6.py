class Shape:
    def __init__(self, shapeType, x, y):
        self.shapeType = shapeType
        self.length = x
        self.width = y
    def computeArea():
        pass

class Rectangle(Shape):
    def __init__(self, shapeType, x, y):
        super().__init__(shapeType, x, y)
    def computeArea(self):
        return self.length*self.width

class Triangle(Shape):
    def __init__(self, shapeType, x, y):
        super().__init__(shapeType, x, y)
    def computeArea(self):
        return self.length*self.width*0.5

ob1=Rectangle("Rectangle",10,20)
print("Area of ",ob1.shapeType,ob1.computeArea())
ob2=Triangle("Triangle",10,20)
print("Area of ",ob2.shapeType,ob2.computeArea())