class Account:
    def __init__(self,name,accnum,type,depo,mindepo):
        self.name=name
        self.accnum=accnum
        self.type=type
        self.depo=depo
        self.mindepo=mindepo

class Saving(Account):
    def __init__(self, name,accnum,type,depo,mindepo):
        super().__init__(name,accnum,type,depo,mindepo)

    def intreset(self,rate):
        total=self.mindepo+self.depo
        intrest=(total*rate*1)/100
        return intrest

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))

    def get(self):
        print(self.name,self.accnum,self.type,self.depo,self.mindepo)

class Current(Account):
    def __init__(self, name, accnum, type, depo, mindepo):
        super().__init__(name, accnum, type, depo, mindepo)

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))

    def get(self):
        print(self.name,self.accnum,self.type,self.depo,self.mindepo)
    
ob1=Saving("Rituraj",12345,"Saving",500,500)
ob1.get()
print(ob1.intreset(5))
ob1=Current("Ritu",67890,"Current",500,500)
ob1.get()