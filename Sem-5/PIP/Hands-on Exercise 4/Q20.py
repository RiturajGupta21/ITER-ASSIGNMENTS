def isfactorial(n):
    i = 1
    while(True) :         
        if (n % i == 0) :
            n //= i  
        else :
            break    
        i += 1
    if (n == 1) :
        return True
    else :
        return False
n=int(input("Enter n -> "))
factors=[]
for i in range(1,n+1):
    if n%i==0:
       factors.append(i)
max=0
for i in range(len(factors)):
    if isfactorial(factors[i]):
        if(factors[i]>max):
            max=factors[i]
print(max)