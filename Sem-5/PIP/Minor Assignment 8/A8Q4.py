def sum(n):
    if n == 1:
        return 1
    return 1/n+(sum(n-1))
print(sum(4))