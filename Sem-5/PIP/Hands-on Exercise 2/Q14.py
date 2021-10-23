import sys
m=int(sys.argv[1])
d=int(sys.argv[2])
if ((m==3 and d>=20 and d>=31)or(m==4 and d>=1 and d<=31)or(m==5 and d>=1 and d<=31)or(m==6 and d>=1 and d<=20)):
    print("True")
else:
    print("False")
