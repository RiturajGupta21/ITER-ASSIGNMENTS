class Vehicle:
    def __init__(self,regnum,make,model,color):
        self.regnum=regnum
        self.make=make
        self.model=model
        self.color=color

class PassengerVehicle(Vehicle):
    def __init__(self, regnum, make, model, color,pasCap):
        super().__init__(regnum, make, model, color)
        self.pascap=pasCap

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))
    
    def get(self):
        print(self.regnum,' ',self.make,' ',self.model,' ',self.color,' ',self.pascap)

class CommercialVehicle(Vehicle):
    def __init__(self, regnum, make, model, color,loadCap):
        super().__init__(regnum, make, model, color)
        self.loadcap=loadCap

    def set(self):
        setattr(self,input("What you want to change "),input("Enter the value "))
    
    def get(self):
        print(self.regnum,' ',self.make,' ',self.model,' ',self.color,' ',self.loadcap)

# ob1=PassengerVehicle("007",'BMW','7 series',"White",'5')
# ob1.get()
# ob1=CommercialVehicle("420",'Mercedes','Actros 2640 LS',"Black",'4 T')
# ob1.get()