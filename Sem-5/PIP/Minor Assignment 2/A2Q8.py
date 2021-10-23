def table(num):
    for i in range(1, 11):      
        print (num, 'x', i, '=', num * i)
if __name__ == '__main__':
    table(int(input("Enter Number ")))
