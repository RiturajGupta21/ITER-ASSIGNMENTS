def f():
    def g():
        a=5
    g()
    print('outer function g, b:',a)
f()