class A:
    attr=0
class B(A):
    pass
print(issubclass(A,B))
print(hasattr(A,'attr'))
A.attr=70
print(A.attr)
delattr(A,'attr')
print(hasattr(A,'attr'))