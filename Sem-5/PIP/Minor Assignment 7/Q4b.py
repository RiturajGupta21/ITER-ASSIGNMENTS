def func():
    l1 = list()
    l2 = list()
    for i in range(0,5):
        l1.append(i)
        l2.append(i+3)
        l1, l2 = l2, l1
    print(l1)
    print(l2)
func()
