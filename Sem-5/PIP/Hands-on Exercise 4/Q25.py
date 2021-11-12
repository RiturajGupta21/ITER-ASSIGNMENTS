t=0
s=0
for i in range(1,500):
    t=i
    for j in range(1,t):
        if(t%j==0):
            s=s+j
    if s==i:
        print(s,end=" ")
    s=0
    t=0