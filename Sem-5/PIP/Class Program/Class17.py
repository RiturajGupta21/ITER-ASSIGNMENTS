def insertionSort(lst):
	for i in range(1, len(lst)):
		temp = lst[i]
		j = i-1
		while j >= 0 and temp < lst[j] :
				lst[j + 1] = lst[j]
				j -= 1
		lst[j + 1] = temp
list1=[1,3,4,5,3,2,1,0,78,3,5]
print('Sorted List: ')
insertionSort(list1)
print(list1)