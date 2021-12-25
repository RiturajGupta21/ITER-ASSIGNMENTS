def printChecking(i,n):
    if n==i:
        return 0
    else :
        if n%i==0:
            return 1
        else :
            return printChecking(i+1,n)
if printChecking(2,9)==0:
    print('It is prime')

else:
    print('It is not prime')
