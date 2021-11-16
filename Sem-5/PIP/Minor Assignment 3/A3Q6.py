def pattern1():
    for i in range(1,6):
        for j in range(1,i+1):
            print(j," ",end='')
        print()
    print()

def pattern2():
    count=1
    result='1'
    for i in range(1,5):
        for j in range(1,5-i):
            print('  ',end='')
        print(result)
        count=count+1
        result=str(count)+' '+result+' '+str(count)
    print()

def pattern3():
    for i in range(5,0,-1):
        for j in range (i,0,-1):
            print(j,' ',end='')
        print()
    print()

def pattern4():
    for i in range(1,6):
        for j in range(1,i+1):
            print(i," ",end='')
        print()
    print()

def pattern5():
    for i in range(1,6):
        for j in range (1,i):
            print('   ',end='')
        for k in range (i,6):
            print(k,' ',end='')
        print()
        

def pattern6():
    for i in range(1,6):
        for j in range(1,6):
            if(i==1 or i==5 or j==1 or j==5):
                print('* ',end='')
            else:
                print('  ',end='')
        print()
    print()

def pattern7():
    for i in range(1,6):
        for j in range(1,6):
            print('* ',end='')
        print()
    print()

def pattern8():
    result='*'
    for i in range(1,5):
        for j in range(1,5-i):
            print('  ',end='')
        print(result)
        result='* '+result+' *'
    print()

def pattern9():
    for i in range(1,5):
        for j in range(1,8):
            if(i==1 or i==j or i+j==8):
                print('* ',end='')
            else:
                print('  ',end='')
        print()
    print()

def pattern10():
    for i in range(1,5):
        for j in range(1,8):
            if(i==1 or (j>=i and j<=8-i)):
                print('* ',end='')
            else:
                print('  ',end='')
        print()
    print()

def pattern11():
    for i in range(1,8):
        for j in range(1,8):
            if(i+j==5 or j-i==3 or i-j==3 or i+j==11):
                print('* ',end='')
            else:
                print('  ',end='')
        print()
    print()

def pattern12():
    for i in range(1,8):
        for j in range(1,8):
            if(i+j>=5 and i-j<=3 and j-i<=3 and i+j<=11):
                print('* ',end='')
            else:
                print('  ',end='')
        print()
    print()

def pattern13():
    for i in range(1,6):
        for j in range (1,i):
            print('   ',end='')
        for k in range (i,6):
            print('$  ',end='')
        print()
    print()

def pattern14():
    for i in range(1,6):
        for j in range (1,6-i):
            print('   ',end='')
        for k in range (1,i+1):
            print('#  ',end='')
        print()
    print()
    
def main():
    pattern1()
    pattern2()
    pattern3()
    pattern4()
    pattern5()
    pattern6()
    pattern7()
    pattern8()
    pattern9()
    pattern10()
    pattern11()
    pattern12()
    pattern13()
    pattern14()
    
if __name__=='__main__':
    main()
