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
# def main():
#     today=MyDate(3,9,2014)
#     print(today)
#     defaultDate=MyDate()
#     print(defaultDate)
# if __name__=='__main__':
#     main()