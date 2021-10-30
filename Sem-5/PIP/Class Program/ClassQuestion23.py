def summation(n):
    even=odd=0
    for count in range (1,n+1):
        if count%2==0: 
            even+=count
        else: 
            odd+=count
    return even,odd
def main():
    n=int(input("Enter number of terms "))
    even,odd=summation(n)
    print("sum of first",n ,"even number is", even,"\nsum of first",n ,"odd number is",odd,"\n")
if __name__ =='__main__':
    main()