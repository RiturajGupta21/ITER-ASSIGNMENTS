class A:
    z=30
    def __init__(self):
        self.x=2
        self.y=10
        self.w=100
    def __str__(self):
        return 'w: '+str(self.w)+', x: '+str(self.x)+', y: '+str(self.y)+', z: '+str(self.z)
class B(A):
    x=4
    y=20
    def __init__(self):
        A.__init__(self)
        self.x=6
        self.v=50
    def __str__(self):
        return 'w: '+str(self.w)+', x: '+str(self.x)+', y: '+str(self.y)+', v: '+str(self.z)+', v:'+str(self.v)
ob1=A()
ob2=B()
print('Ob1: ',ob1)
print('Ob2: ',ob2)