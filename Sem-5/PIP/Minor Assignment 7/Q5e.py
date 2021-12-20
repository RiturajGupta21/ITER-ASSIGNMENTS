x=[1,2,4,6,9,10,14,15,17]
for i in range(0,len(x)):
    if (x[i]%2 == 0):
        x[i] = 4*i
    elif (x[i]%3 == 0):
        x[i] = 9*i
    else:
        x[i] *= 2
print(x)
