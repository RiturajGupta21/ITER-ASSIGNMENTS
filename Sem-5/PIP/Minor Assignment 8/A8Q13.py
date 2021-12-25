def insert(lst,x,k,lst2=[]):
    if len(lst)>k-1:
        lst2=lst[:k]
        lst2.append(x)
        return lst2+insert(lst[k:],x,k)
    elif len(lst)>0:
        return lst2+lst
    else:
        return lst2
lst= [1,2,3,4,5,6,7]
x=50
k=3
print(insert(lst,x,k))