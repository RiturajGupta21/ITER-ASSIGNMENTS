def a(n):
    print("\na\n")
    for i in range(1, n+1):
        for j in range(1, i+1):
            print(j,end="")
        print("\r")

def b(n):
    print("\nb\n")
    for i in range(1, n+1):
        for j in range(1, n-i+1):
            print(end=" ")
        for j in range(i,0,-1):
            print(j,end="")
        for j in range(2,i+1):
            print(j,end="")
        print("\r")

def c(n):
    print("\nc\n")
    for i in range(n, 0, -1):
        for j in range(i, 0, -1):
            print(j, end="")
        print("\r")  

        
def main():
    n = int(input("Enter number of rows: "))
    a(n)
    b(n)
    c(n)
if __name__ =="__main__":
    main()