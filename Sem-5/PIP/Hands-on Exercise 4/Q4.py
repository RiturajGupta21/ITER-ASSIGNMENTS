n=int(input("Enter n -> "))
fact = 1
if n < 0:
   print("Factorial donot exist")
elif n == 0:
   print("1")
else:
   for i in range(1,n + 1):
       fact = fact*i
   print("Factorial of",n,"is",fact)
