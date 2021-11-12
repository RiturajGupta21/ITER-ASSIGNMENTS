n=int(input("Enter n -> "))
st=""
while n>0:
    rem=n%2
    st=str(rem)+st
    n=n//2
print(st)