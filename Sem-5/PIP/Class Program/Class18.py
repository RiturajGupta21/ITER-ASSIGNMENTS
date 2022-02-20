def linearSearch(lst,searchValue):
    for i in range(len(lst)):
        if lst[i]==searchValue:
            return i
    return None

lst=[1,3,4,5,3,2,1,0,78,3,5]
print(linearSearch(lst,3))