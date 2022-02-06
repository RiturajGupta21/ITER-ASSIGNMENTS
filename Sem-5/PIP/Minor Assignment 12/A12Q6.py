def linearSearch(lst, l, r, key):
    if r < l:
        return -1
    if lst[l] == key:
        return l
    if lst[r] == key:
        return r
    return linearSearch(lst, l+1, r-1, key)


lst = [1, 3, 4, 5, 3, 2, 1, 0, 78, 3, 5]
n = len(lst)
key = 3
index = linearSearch(lst, 0, n-1, key)
if index != -1:
    print("Element", key, "is present at index %d" % (index))
else:
    print("Element %d is not present" % (key))


def binarySearch(lst, low, high, key):
    if high >= low:
        mid = (high + low) // 2
        if lst[mid] == key:
            return mid
        elif lst[mid] > key:
            return binarySearch(lst, low, mid - 1, key)
        else:
            return binarySearch(lst, mid + 1, high, key)
    else:
        return -1


lst = [1, 3, 4, 5, 3, 2, 1, 0, 78, 3, 5]
key = 3
lst.sort()
index = binarySearch(lst, 0, len(lst)-1, key)
if index != -1:
    print("Element", key, "is present at index %d" % (index))
else:
    print("Element %d is not present" % (key))
