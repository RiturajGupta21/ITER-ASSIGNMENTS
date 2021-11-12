d=int(input("Enter d -> "))
e=int(input("Enter e -> "))
b=1
a=0
s=0
k=0
for i in range(max(d,e)):
    if (((d==0) and (e==1))) or (((d==1) and (e==0))):
        k=1
        print("True")
        break
    else:
        if (((d==a) and (e==b))) or (((d==b) and (e==a))):
            k=1
            print("True")
            break
        s=a+b
        a=b
        b=s
if k==0:
    print("False")

