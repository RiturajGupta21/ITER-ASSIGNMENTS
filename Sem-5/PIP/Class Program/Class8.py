from Class1 import Person
from Class2 import MyDate

class Employee(Person):
    nextid=1001
    employeecount=0
    def __init__(self, name, DOB, address,basicsalary,dateofjoining):
        Person.__init__(self,name, DOB, address)
        self.idnum=Employee.nextid
        self.basicssalary=basicsalary
        self.dateofjoining=dateofjoining
        Employee.nextid+=1
        Employee.employeecount+=1

    def getid(self):
        return self.idnum
    
    def getsalary(self):
        return self.basicssalary

    def revisesalary(self,newsalary):
        self.basicssalary=newsalary
    
    def getjoiningdate(self):
        return self.dateofjoining

    def __str__(self):
        return Person.__str__(self)+'\nid:'+str(self.getid())+'\nsalary:'+str(self.getsalary())+'\ndate of joining: '+str(self.getjoiningdate())

    def __lt__(self,other):
        return self.getid()<other.getid()

    def __del__(self):
        Person.__del__(self)
        Employee.employeecount-=1
    
# emp1=Employee('rehman',MyDate(5,6,1997),'Mumbai',90000,MyDate(1,6,2021))
# emp2=Employee('PQR',MyDate(1,6,1996),'BBSR',95000,MyDate(1,8,2022))
# print(emp1)
# print(emp2)
# print(Employee.employeecount)
# del emp1
# print(Employee.employeecount)
