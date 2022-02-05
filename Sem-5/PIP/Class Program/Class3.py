class Point:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def __str__(self):
        return str((self.x,self.y))
    def __add__(self1,self2):
        x=self1.x+self2.x
        y=self1.y+self2.y
        return Point(x,y)
p1=Point(3,4)
p2=Point(5,7)
print(p1)
print(p2)
print(p1+p2)