import pdb
pdb.set_trace()
def max3(n1, n2, n3):
    '''
    Objective: To find maximum of three numbers
    Input Parameters: n1,n2,n3 - numeric values
    Return Value: maxNumber - numeric value
    '''
    maxNumber=0
    if n1 > n2 :
        if n1 > n3:
            maxNumber = n1
        else:
            maxNumber = n3
    elif n2 > n3:
        maxNumber=n2
    else:
        maxNumber = n3
    return maxNumber
def main():
    '''
    Objective: To find maximum of three numbers
    Input Parameter: None
    Return Value: None
    '''
    n1 = int(input('Enter first number: '))
    n2 = int(input('Enter second number: '))
    n3 = int(input('Enter third number: '))
    maximum = max3(n1,n2,n3)
    print('Maximum number is:',maximum)
if __name__ == "__main__":
    main()