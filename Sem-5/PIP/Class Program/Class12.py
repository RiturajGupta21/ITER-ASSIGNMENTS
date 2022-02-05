# import sys
# sys.path.append('C:\Desktop\Python ITER SOA\Codes\ch_10,11,12_Class_codes')
from Class2 import MyDate
from Class11 import MyTime



class Appointment(MyDate, MyTime):
    
    def __init__(self, day, month, year, hours, minutes, seconds, description):
        MyDate.__init__(self, day, month, year)
        MyTime.__init__(self, hours, minutes, seconds)
        self.description=description
        
    def __str__(self):
        return MyDate.__str__(self)+', '+MyTime.__str__(self)+'\n'+self.description

    
meetstaff=Appointment(15,1, 2022, 10,0,0, ' meeting with staff regarding Covid-19')
meetteachers=Appointment(13,1, 2021, 9,10,11, ' meeting with Teachers regarding online class')
print(meetstaff)
print(meetteachers)