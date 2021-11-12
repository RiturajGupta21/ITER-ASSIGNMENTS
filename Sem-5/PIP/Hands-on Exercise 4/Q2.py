j=0
for i in range(100,1001):
    if (i%5==0 and i%6==0):
        print(i," ",end="")
        j+=1
    if j==10:
        j=0
        print()