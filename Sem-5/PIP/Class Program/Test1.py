class Person:
    count=0
    def __init__ (self, name, DOB, address):
        self.name=name
        self.DOB=DOB
        self.address=address
        Person.count+=1
    # def getName(self):
    #     return self.name
    # def getDOB(self):
    #     return self.DOB
    # def getAddress(self):
    #     return self.address
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
def main():
    p1=Person('Rituraj','21 oct 2001','Darbhanga')
    p2=Person('Jhanvi','14 Jan 2001','Patna')
    print(p1)
    print(p2)
if __name__ =='__main__':
    main()