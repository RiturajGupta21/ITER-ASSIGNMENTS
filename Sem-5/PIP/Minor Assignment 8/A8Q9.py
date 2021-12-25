def mul(a,b):
    if b==0:
        return 0
    return a+mul(a,b-1)
print(mul(2,3))