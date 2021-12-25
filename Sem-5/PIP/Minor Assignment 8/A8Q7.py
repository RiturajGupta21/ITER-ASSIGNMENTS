def powersetsum(arr, arr1, n):
    if n == 0:
        print(sum(arr1))
        return
    arr1.append(arr[n-1])
    powersetsum(arr,arr1,n-1)
    arr1.pop()
    powersetsum(arr,arr1,n-1)
arr=[2, 3]
arr1 =[]
powersetsum(arr, arr1, len(arr))