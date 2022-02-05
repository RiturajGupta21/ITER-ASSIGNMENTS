def selectionSort(list1):
    for i in range(0,len(list1)-1):
        minindex=i
        for j in range(i+1,len(list1)):
            if list1[j]<list1[minindex]:
                minindex=j
        if minindex!=i:
            list1[i],list1[minindex]=list1[minindex],list1[i]
list1=[1,3,4,5,3,2,1,0,78,3,5]
print('Sorted List: ')
selectionSort(list1)
print(list1)