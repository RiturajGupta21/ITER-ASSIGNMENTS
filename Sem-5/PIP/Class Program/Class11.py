import sys
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
        #hh:mm:ss
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
           #hh:mm:ss format

currenttime=MyTime(22,11,45)
print(currenttime)       
            