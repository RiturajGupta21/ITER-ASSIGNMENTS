class Employees:
    def __init__(self, empNum, name, salay):
        self.empNum = empNum
        self.name = name
        self.salary = salay

    def convert(self):
        lst = []
        lst.extend([self.empNum, self.name, self.salary])
        return lst

# Selection Sort


def selectionSort(list1):
    for i in range(0, len(list1)-1):
        minindex = i
        for j in range(i+1, len(list1)):
            if list1[j][2] < list1[minindex][2]:
                minindex = j
        if minindex != i:
            list1[i], list1[minindex] = list1[minindex], list1[i]


lst = []
e1 = Employees(1, "John", 80000)
e2 = Employees(2, "Mike", 50000)
e3 = Employees(3, "Derek", 30000)
e4 = Employees(4, "Raj", 25000)
lst.extend([e1.convert(), e2.convert(), e3.convert(), e4.convert()])
print('\n**********************************Unsorted List**********************************')
print(lst)
print('Sorted List Using Selection Sort: ')
selectionSort(lst)
print(lst)

# Bubble Sort


def bubbleSort(lst):
    n = len(lst)
    for i in range(n):
        for j in range(0, n-i-1):
            if lst[j][2] > lst[j+1][2]:
                lst[j], lst[j+1] = lst[j+1], lst[j]


lst = []
e1 = Employees(1, "John", 80000)
e2 = Employees(2, "Mike", 50000)
e3 = Employees(3, "Derek", 30000)
e4 = Employees(4, "Raj", 25000)
lst.extend([e1.convert(), e2.convert(), e3.convert(), e4.convert()])
print('\n**********************************Unsorted List**********************************')
print(lst)
print('Sorted List Using Bubble Sort: ')
bubbleSort(lst)
print(lst)

# Insertion Sort


def insertionSort(lst):
    for i in range(1, len(lst)):
        temp = lst[i][2]
        j = i-1
        while j >= 0 and temp < lst[j][2]:
            lst[j + 1][2] = lst[j][2]
            j -= 1
        lst[j + 1][2] = temp


lst = []
e1 = Employees(1, "John", 80000)
e2 = Employees(2, "Mike", 50000)
e3 = Employees(3, "Derek", 30000)
e4 = Employees(4, "Raj", 25000)
lst.extend([e1.convert(), e2.convert(), e3.convert(), e4.convert()])
print('\n**********************************Unsorted List**********************************')
print(lst)
print('Sorted List Using Insertion Sort: ')
insertionSort(lst)
print(lst)
print()
