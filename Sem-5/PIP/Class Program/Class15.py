def bubbleSort(lst):
	n = len(lst)
	for i in range(n):
		for j in range(0, n-i-1):
			if lst[j] > lst[j+1] :
				lst[j], lst[j+1] = lst[j+1], lst[j]

list1=[1,3,4,5,3,2,1,0,78,3,5]
print('Sorted List: ')
bubbleSort(list1)
print(list1)