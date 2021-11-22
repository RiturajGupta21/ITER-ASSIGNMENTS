import pdb
pdb.set_trace()
def summation(n):
    total=0
    for i in range(1,n):
        total=total+i
    return total
def main():
    n=int(input("Enter number of terms"))
    total=summation(n)
    print('Sum of first',n,'positive intege',total)
if __name__=='__main__':
    main()