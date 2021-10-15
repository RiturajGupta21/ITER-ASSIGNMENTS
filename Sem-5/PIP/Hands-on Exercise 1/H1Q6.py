a = 10
b = 5

print("Before swapping a: ", a)
print("Before swapping b: ", b)

#a, b = b, a 

a = a ^ b
b = a ^ b
a = a ^ b

print("After swapping a: ", a)
print("After swapping b: ", b)
