n=int(input("Enter n -> "))
i = 1
while(True) :         
    if (n % i == 0) :
        n //= i  
    else :
        break    
    i += 1
if (n == 1) :
    print("Factorial")
else :
    print("Not a factorial")