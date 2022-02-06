def binarySearch(lst, searchValue):
    low, high = 0, len(lst)-1
    while low <= high:
        mid = int((low+high)/2)
        if lst[mid] == searchValue:
            return mid
        elif searchValue < lst[mid]:
            high = mid-1
        else:
            low = mid+1
            return None


def isSorted(lst):
    for i in range(1, len(lst)):
        if lst[i] < lst[i-1]:
            return False
    return True


def main():
    lst = eval(input('Enter a sorted list (ascending order) :'))
    if not(isSorted(lst)):
        print('Given list is not sorted')
    else:
        searchVal = eval(input('Enter the value to be searched :'))
        print(searchVal, 'found at index', binarySearch(lst, searchVal))


if __name__ == '__main__':
    main()
