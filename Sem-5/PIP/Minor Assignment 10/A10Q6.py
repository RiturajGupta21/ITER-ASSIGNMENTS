class Student:
    def __init__(self, rollNumber, name, marksList, stream, percentange, grade, division):
        self.rollNumber = rollNumber
        self.name = name
        self.marksList = marksList
        self.stream = stream
        self.percentange = percentange
        self.grade = grade
        self.division = division

    def setMarks(self):
        self.marksList = eval(input("Enter the marks in list fashon: "))

    def getStream(self):
        print(self.stream)

    def Percantage(self):
        self.percentange = sum(self.marksList)/len(self.marksList)

    def gradeGen(self):
        if self.percentange>=90:
            self.grade='A'
        elif self.percentange>=80:
            self.grade='B'
        elif self.percentange>=65:
            self.grade='C'
        elif self.percentange>=40:
            self.grade='D'
        else:
            self.grade='E'
    def __str__(self):
        return 'Roll No.: '+str(self.rollNumber)+'\nName: '+self.name+'\nMarksList: '+str(self.marksList)+'\nStream: '+self.stream+'\nPercenrage: '+str(self.percentange)+'\nGrade: '+self.grade+'\nDivision: '+self.division
s=Student(2660,"Rituraj",[],"CSE",0,'E',"1st")
print('-------------------------------------------\n',s,'\n-------------------------------------------\n')
s.setMarks()
print('-------------------------------------------\n',s,'\n-------------------------------------------\n')
s.Percantage()
s.gradeGen()
print('-------------------------------------------\n',s,'\n-------------------------------------------\n')