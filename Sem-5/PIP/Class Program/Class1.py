class Person:
    count=0
    def __init__ (self, name, DOB, address):
        self.name=name
        self.DOB=DOB
        self.address=address
        Person.count+=1
    def __del__(self):
        Person.count-=1  
    def getName(self):
        return self.name
    def getDOB(self):
        return self.DOB
    def getAddress(self):
        return self.address
    def setName(self,name):
        self.name=name
    def setDOB(self,DOB):
        self.DOB=DOB
    def setAddress(self,address):
        self.address=address
    def getCount(self):
        return Person.count
    def __str__ (self):
        return 'Name: '+self.name+'\tDOB: '+str(self.DOB)+'\tAddress:'+self.address