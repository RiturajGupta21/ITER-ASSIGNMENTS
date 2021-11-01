n=int(input("Enter the number -> "))
t=0
for c in range(1,n+1):
    t+=c
print("For Loop ",t)

c=1
t=0
while(c<n+1):
    t+=c
    c+=1
print("While Loop",t)