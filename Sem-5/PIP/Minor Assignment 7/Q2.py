def cumulativeSum(l):
    s=0
    final=[]
    for ele in l:
        s=s+ele
        final.append(s)
    return final
def main():
    n=int(input('Enter The Number Of Value In A List: '))
    l=[]
    print('Enter',n,'Numbers In A List: ')
    for i in range(n):
        l.append(int(input()))
    print('Original List:',l)
    print('Final List:',cumulativeSum(l))
if __name__=='__main__':
    main()
