def merge(lst1,lst2):
    sortedlst=[]
    while len(lst1)!=0 and len(lst2)!=0:
        if lst1[0]<lst2[0]:
            sortedlst.append(lst1[0])
            lst1.remove(lst1[0])
        else:
            sortedlst.append(lst2[0])
            lst2.remove(lst2[0])
    if len(lst1)==0:
        sortedlst+=lst2
    else:
        sortedlst+=lst1
    return sortedlst

def mergesort(lst):
    if len(lst)==0 or len(lst)==1:
        return lst
    else:
        mid=len(lst)//2
        lst1=mergesort(lst[:mid])
        lst2=mergesort(lst[mid:])
        return merge(lst1,lst2)

lst=[1,4,2,3]
print(mergesort(lst))