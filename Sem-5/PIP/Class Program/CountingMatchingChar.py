def nMatchedChar(str1,str2):
    temp1=str1.lower()
    temp2=str2.lower()
    count=0
    for ch1 in temp1:
        for ch2 in temp2:
            if ch1==ch2:
                count+=1
    return count
print(nMatchedChar("Hello","hello"))