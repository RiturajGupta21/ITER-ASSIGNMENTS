def delete(lst,curr,n):
    ri=curr+n
    if(ri>=len(lst)+1):
        return
    lst.remove(ri)
    delete(lst,ri,n)
lst=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
delete(lst,0,3)
print(lst)