passMark=40
marks=int(input("Enter mark of student "))
if marks<40:
    print("Failed")
elif marks>=40 and marks<75:
    print("Student passed and is good student")
elif marks>=75 and marks<90:
    print("Student passed and is very good student")
else:
    print("Student passed and is extraordinarily student")