num = int(input("Input a 4 digit numbers  "))
x=0
digit  = num //1000
x += (1 - digit % 2) * digit
digit1 = (num - digit*1000)//100
x += (1 - digit1 % 2) * digit1
digit2 = (num - digit*1000 - digit1*100)//10
x += (1 - digit2 % 2) * digit2
digit3 = (num - digit*1000 - digit1*100-digit2*10)
x += (1 - digit3 % 2) * digit3
print(x)

