def binarySearch(lst, n, key):
    start = 0
    end = n
    while (start <= end):
        mid = start + (end - start) // 2
        if (key == lst[mid]):
            return mid
        elif (key < lst[mid]):
            start = mid + 1
        else:
            end = mid - 1
    return -1


lst = [5, 4, 3, 2, 1]
n = len(lst)
key = 3
print(binarySearch(lst, n, key))