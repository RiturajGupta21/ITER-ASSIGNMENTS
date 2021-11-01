n=input("Enter the number -> ")
s=0
for _ in iter(int, 1):
    if n=='':
        break
    s+=int(n)
    n=input("Enter the number -> ")
print (s)