def digitToText(n):
    res=''
    dic={0:'Zero',1:'One',2:'Two',3:'Three',4:'Four',5:'Five',6:'Six',7:'Seven',8:'Eight',
         9:'Nine'}
    while n!=0:
        res=' '+dic[n%10]+res
        n=n//10
    return res.strip()
def main():
    n=int(input('Enter A Number: '))
    if n<0:
        print('Result: -',digitToText(-n))
    else:
        print('Result:',digitToText(n))
if __name__=='__main__':
    main()
