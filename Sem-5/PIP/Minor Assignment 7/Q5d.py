quantity=[15,30,12,34,56,99]
total=0
for i in range(0, len(quantity)):
    if(quantity[i]>15):
        total += quantity[i]
print(total)
