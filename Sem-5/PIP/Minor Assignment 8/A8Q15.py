def remove(lst,i):
    if i==len(lst)-1:
        return
    if not lst:
        return 
    if lst[i]==lst[i+1]:
        tmp=lst[i]
        while(i<len(lst) and lst[i]==tmp):
            lst.pop(i)
        if not i-1:
            remove(lst,i-1)
        else:
            remove(lst,0)
    else:
        remove(lst,i+1)
inp=[1, 2, 4, 4, 5, 7, 7, 7, 8, 8, 9, 7]
remove(inp,0)
print(inp)