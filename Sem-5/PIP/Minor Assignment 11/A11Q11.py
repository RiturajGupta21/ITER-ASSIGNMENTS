import sys
class MyDate:
    def __init__(self,day=1,month=1, year=2000):
        if not(type(day)==int and type(month)==int and type(year)==int):
            print('Invalid data provided for date !')
            sys.exit()
        if month>0 and month<=12:
            self.month=month
        else:
            print('Invalid data  for month !')
            sys.exit()
        if year>1900:
            self.year=year
        else:
            print('Invalid data for year and year should be greateer than 1900.')
            sys.exit()
        self.day=self.checkday(day)
    def checkday(self,day):
        if self.year%400==0 or (self.year%100!=0 and self.year%4==0):
            currentYear=[31,29,31,30,31,30,31,31,30,31,30,31]
        else:
            currentYear=[31,28,31,30,31,30,31,31,30,31,30,31]
        if (day>0 and day<=currentYear[self.month-1]):
            return day
        else:
            print('Invalid value for day')
            sys.exit()
    def __str__(self):
        if self.day<=9:
            day='0'+str(self.day)
        else:
            day=str(self.day)
        if self.month<=9:
            month='0'+str(self.month)
        else:
            month=str(self.month)
        return day+'-'+month+'-'+str(self.year)

class MyTime:
    def __init__(self, hours=0,minutes=0,seconds=0):
        self.sethours(hours)
        self.setminutes(minutes)
        self.setseconds(seconds)
    def sethours(self, hours):
        if hours>=0 and hours<=23:
            self.hours=hours
        else:
            print('invalid value for hours')
            sys.exit()
    def setminutes(self,minutes):
        if minutes>=0 and minutes<=59:
            self.minutes=minutes
        else:
            print('invalid value for minutes')
            sys.exit()
            
    def setseconds(self,seconds):
        if seconds>=0 and seconds<=59:
            self.seconds=seconds
        else:
            print('invalid value for seconds')
            sys.exit()
    def __str__(self):
        if self.hours<=9:
            hours='0'+str(self.hours)
        else:
            hours=str(self.hours)
        
        if self.minutes<=9:
            minutes='0'+str(self.minutes)
        else:
            minutes=str(self.minutes)
        
        if self.seconds<=9:
            seconds='0'+str(self.seconds)
        else:
            seconds=str(self.seconds)
        
        return hours+':'+minutes+':'+seconds

class Appointment(MyDate, MyTime):
    def __init__(self, day, month, year, hours, minutes, seconds, description):
        MyDate.__init__(self, day, month, year)
        MyTime.__init__(self, hours, minutes, seconds)
        self.description=description
        
    def __str__(self):
        return MyDate.__str__(self)+', '+MyTime.__str__(self)+'\n'+self.description

print(Appointment(15,1, 2022, 10,0,0, 'meeting regarding Covid-19'))