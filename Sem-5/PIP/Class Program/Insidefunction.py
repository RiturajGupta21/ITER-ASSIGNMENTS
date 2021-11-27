a=6
def f():
    a=5
    def g():
        b=a
        print('inside function g, b:',b)
    g()
f()