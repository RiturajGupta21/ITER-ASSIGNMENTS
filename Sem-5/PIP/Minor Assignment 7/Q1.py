def removeDuplicate(l):
    final=[]
    for ele in l:
        if (not(ele in final)):
            final.append(ele)
    return final
def main():
    n=int(input('Enter The Number Of Value In A List: '))
    print('Enter',n,'Values In A List:')
    l=[]
    for i in range(n):
        l.append(int(input()))
    print('Original List:',l)
    print('Modified List:',removeDuplicate(l))
if __name__=='__main__':
    main()
