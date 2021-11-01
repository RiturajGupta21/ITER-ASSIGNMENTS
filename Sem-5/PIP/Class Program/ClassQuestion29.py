def rightTriangle(nRows):
    for i in range(1,nRows+1):
        print("*"*i)
def invertedTriangle(nRows):
    nSpaces=0
    nStars=2*nRows-1
    for i in range(1,nRows+1):
        print(' '*nSpaces+'*'*nStars)
        nStars-=2
        nSpaces+=1
def main():
    choice=int(input("Enter 1 for right triangle -> \nEnter 2 for inverted triangle -> \n"))
    assert choice==1 or choice==2
    nRows=int(input("Enter number of rows -> "))
    if choice==1:
        rightTriangle(nRows)
    else:
        invertedTriangle(nRows)
if __name__=='__main__':
    main()