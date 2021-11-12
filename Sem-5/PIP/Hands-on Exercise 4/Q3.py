n=int(input("Enter n -> "))
odd=1
sum =0
addsum=0
sign=0
for i in range(0,n):
    sign = int(pow(-1,i))
    addsum=odd*sign
    sum = sum + addsum
    odd = odd + 2
print("The sum of terms is = ", sum)