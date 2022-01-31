from A11Q7 import PassengerVehicle
class Car(PassengerVehicle):
    def __init__(self, regnum, make, model, color, pasCap,numdoor):
        super().__init__(regnum, make, model, color, pasCap)
        self.numdoor=numdoor

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))
    
    def get(self):
        print(self.regnum,' ',self.make,' ',self.model,' ',self.color,' ',self.pascap,' ',self.numdoor)

class Autorikshaw(PassengerVehicle):
    def __init__(self, regnum, make, model, color, pasCap):
        super().__init__(regnum, make, model, color, pasCap)

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))

    def get(self):
        print(self.regnum,' ',self.make,' ',self.model,' ',self.color,' ',self.pascap)

class Bus(PassengerVehicle):
    def __init__(self, regnum, make, model, color, pasCap,numdoor,dD):
        super().__init__(regnum, make, model, color, pasCap)
        self.numdoor=numdoor
        self.dD=dD

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))
    
    def get(self):
        if(self.dD==True):
            print(self.regnum,' ',self.make,' ',self.model,' ',self.color,' ',self.pascap,' ',self.numdoor,' ','Double Decker')
        else:
            print(self.regnum,' ',self.make,' ',self.model,' ',self.color,' ',self.pascap,' ',self.numdoor,' ','Not Double Decker')
    
ob1=Car("007",'BMW','7 series',"White",5,4)
ob1.get()
ob1=Autorikshaw("420",'Bajaj','RE Compact',"Black",5)
ob1.get()
ob1=Bus("1",'Mercedes','eCitaro',"Grey",85,2,True)
ob1.get()