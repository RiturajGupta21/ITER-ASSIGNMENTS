# import sys
# sys.path.append('C:\Desktop\Python ITER SOA\Codes\ch_10&11_Class_codes')
from Class8 import Employee
from Class2 import MyDate

class Clerk(Employee):
    clerkcount=0
    def __init__(self, name, DOB, address, basicsalary, dateofjoining):
        super().__init__(name, DOB, address, basicsalary, dateofjoining)
        Clerk.clerkcount+=1
        
    def __del__(self):
        super().__del__()
        Clerk.clerkcount-=1
        
class Manager(Employee):
        managercount=0
        def __init__(self, name, DOB, address, basicsalary,dateofjoining, managerialpay):
            super().__init__(name, DOB, address, basicsalary, dateofjoining)
            self.managerialpay=managerialpay
            Manager.managercount+=1
        def updatemanagerialpay(self, newmanagerialpay):
            self.managerialpay=newmanagerialpay
        def getsalary(self):
            return Employee.getsalary(self)+self.managerialpay
        def __str__(self):
            return Employee.__str__(self)+'\nManagerialPay: '+str(self.managerialpay)
        def __del__(self):
            super().__del__()
            Manager.managercount-=1

clerk1=Clerk('Arjun', MyDate(5,6,1930), ' D-9, Sarojani Nagaar, Delhi', 20000, MyDate(5,6,1950))
print(clerk1)
manager1=Manager('Tes', MyDate(5,6,1930), ' D-9, Sarojani Nagaar, Delhi', 20000, MyDate(5,6,1950),10000)
print(manager1)