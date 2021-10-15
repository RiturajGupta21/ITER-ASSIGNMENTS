num = int(input("Input a numbers between 0 and 1000: "))
digit  = num //100
print(digit)
digit1 = (num - digit*100)//10
print(digit1)
digit2 = (num - digit*100 - digit1*10)
print("Sum of digits is", digit+digit1+digit2)
