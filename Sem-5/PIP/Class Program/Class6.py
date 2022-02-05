class Person:
    count=0
    def __init__ (self, name, DOB, address):
        self.name=name
        self.DOB=DOB
        self.address=address
        Person.incPersonCount()
    @staticmethod
    def incPersonCount():
        Person.count+=1
    @staticmethod
    def getPersonCount():
        return Person.count
p1=Person('Rituraj','21,10,2001','Darbhanga')
p2=Person('Jhanvi','14,1,2001','Patna')
print(Person.getPersonCount())