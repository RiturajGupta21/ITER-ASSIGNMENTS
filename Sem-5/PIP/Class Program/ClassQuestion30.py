# n = int(input("Enter the Value of n : "))
# s=0
# while(n>0):
#     d=n%10
#     if(d%2==0):
#         s=s+d
#     n=n//10
# print(s)

n=input("Enter the number ")
s=0
for i in n:
    if int(i)%2!=0:
        s=s+int(i)
print (s)
