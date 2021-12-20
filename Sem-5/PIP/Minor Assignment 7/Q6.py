def multipleList(n):
    l1=[]
    for i in range(1,n+1):
        l2=[]
        for j in range(1,6):
            l2.append(i*j)
        l1.append(l2)
    print(l1)
def main():
    n=int(input('Enter A Number: '))
    multipleList(n)
if __name__=='__main__':
    main()
