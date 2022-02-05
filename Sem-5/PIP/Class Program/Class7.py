from tkinter.ttk import Style


class Student:
    maxMarks=500
    def __init__(self,name,rollno,marks):
        self.name=name
        self.rollno=rollno
        self.marks=marks
    def percentage(self):
        percent=(float(self.marks)/Student.maxMarks)*100
        return percent
    def result(self):
        return 'pass' if self.percentage() >=40 else 'fail'
s1=Student('Rituraj',660,495)
print(s1.percentage())
print(s1.result())