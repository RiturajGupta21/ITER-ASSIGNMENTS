def minIndex(a, i, j):
    if i == j:
        return i
    k = minIndex(a, i + 1, j)
    return (i if a[i] < a[k] else k)


def selectionSort(lst, n, index=0):
    if index == n:
        return -1
    k = minIndex(lst, index, n-1)
    if k != index:
        lst[k], lst[index] = lst[index], lst[k]
    selectionSort(lst, n, index + 1)


lst = [1, 3, 4, 5, 3, 2, 1, 0, 78, 3, 5]
n = len(lst)
print('\n**********************************Unsorted List**********************************')
print(lst)
print('Sorted List Using Selection Sort: ')
selectionSort(lst, n)
print(lst)


def bubbleSort(lst, n):
    if n == 1:
        return
    for i in range(n - 1):
        if lst[i] > lst[i + 1]:
            lst[i], lst[i + 1] = lst[i + 1], lst[i]
        bubbleSort(lst, n - 1)


lst = [1, 3, 4, 5, 3, 2, 1, 0, 78, 3, 5]
n = len(lst)
print('\n**********************************Unsorted List**********************************')
print(lst)
print('Sorted List Using Bubble Sort: ')
bubbleSort(lst, n)
print(lst)


def insertionSort(arr, n):
    if n <= 1:
        return
    insertionSort(arr, n-1)
    last = arr[n-1]
    j = n-2
    while (j >= 0 and arr[j] > last):
        arr[j+1] = arr[j]
        j = j-1

    arr[j+1] = last


lst = [1, 3, 4, 5, 3, 2, 1, 0, 78, 3, 5]
n = len(lst)
print('\n**********************************Unsorted List**********************************')
print(lst)
print('Sorted List Using Insertion Sort: ')
insertionSort(lst, n)
print(lst)
print()
