import sys

x=int(sys.argv[1])
y=int(sys.argv[2])
z=int(sys.argv[3])
if x<y<z or x>y>z:
    print("True")
else:
    print("False")