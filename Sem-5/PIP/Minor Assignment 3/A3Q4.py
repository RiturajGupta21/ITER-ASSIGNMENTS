def lcm(m, n):
   if m > n:
       temp = m
   else:
       temp = n
   while(True):
       if((temp % m == 0) and (temp % n == 0)):
           lcm = temp
           break
       temp += 1
   return lcm
m = int(input("Enter number m: "))
n = int(input("Enter number n: "))
print("The L.C.M. is", lcm(m, n))