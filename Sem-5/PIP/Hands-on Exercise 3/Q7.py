mon=int(input("Enter 1 for jan, 2 for feb ... 12 for dec -> "))

yr=int(input("Enter Year -> "))


if mon==1:
    print("Jan ",yr,"had 31 days")
elif mon==2:
    if (yr%4==0 and yr%100!=0 or yr%400==0):
        print("Feb ",yr,"had 29 days")
    else:
        print("Feb ",yr,"had 28 days")
elif mon==3:
    print("Mar ",yr,"had 31 days")
elif mon==4:
    print("Apr ",yr,"had 30 days")
elif mon==5:
    print("May ",yr,"had 31 days")
elif mon==6:
    print("Jun ",yr,"had 30 days")
elif mon==7:
    print("Jul ",yr,"had 31 days")
elif mon==8:
    print("Aug ",yr,"had 31 days")
elif mon==9:
    print("Sep ",yr,"had 30 days")
elif mon==10:
    print("Oct ",yr,"had 31 days")
elif mon==11:
    print("Nov ",yr,"had 30 days")
elif mon==12:
    print("Dec ",yr,"had 31 days")
else :
    print("Invalid choice")