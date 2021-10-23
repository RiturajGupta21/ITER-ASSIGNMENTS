#a
def test(a, b):
    a = a + b
    b = a - b
    a = a - b
    print('a =', a)
    print('b =', b)
test(5, 8)
#b
def func():
    pass
a = func()
print(a)
