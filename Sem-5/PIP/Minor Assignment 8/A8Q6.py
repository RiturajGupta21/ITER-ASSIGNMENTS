def sum(n):
    if n<1:
        return 0
    return n+sum(n-2)
print(sum(5))