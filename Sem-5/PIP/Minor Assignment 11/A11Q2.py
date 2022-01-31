class Compute:
    def area(self, x = None, y = None):
        if x != None and y != None:
            return x * y
        elif x != None:
            return x * x
        else:
            return 0
obj = Compute()
print('Area Value: ', obj.area())
print('Area Value: ', obj.area(4))
print('Area Value: ', obj.area(3,5))