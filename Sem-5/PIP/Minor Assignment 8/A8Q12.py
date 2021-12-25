def combine(str1,str2,res,i,j,lst):
    if i==len(str1) and j==len(str2):
        lst.append(res)
        return
    if i<len(str1):
        combine(str1,str2,res+str1[i],i+1,j,lst)
    if j<len(str2):
        combine(str1,str2,res+str2[j],i,j+1,lst)
str1='AB'
str2='CD'
lst=[]
combine(str1,str2,'',0,0,lst)
print(lst)
