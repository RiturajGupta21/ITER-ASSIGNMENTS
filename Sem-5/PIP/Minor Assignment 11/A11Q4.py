import math

from numpy import mat
class Point:
    def __init__ (self, x, y):
        self.x = x
        self.y = y
class LineSegment(Point):
    def __init__(self, x, y):
        super().__init__(x, y)
    def length(self,other):
        return math.sqrt(((self.x-other.x)**2)+((self.y-other.y)**2))
    
ob1=LineSegment(10,20)
ob2=LineSegment(5,10)
print(LineSegment.length(ob1,ob2))
