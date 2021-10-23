'''def operations(a,b,c):
    if(c=='+'):
        return a+b
    elif(c=='-'):
        return a-b
    elif(c=='*'):
        return a*b
    elif(c=='/'):
        return a/b
    elif(c=='%'):
        return a%b
    elif(c=='**'):
        return a**b
    elif(c=='//'):
        return a//b
    else:
        print("Non specfied soperation")
print(operations(10,5,'+'))
print(operations(10,5,'-'))
print(operations(10,5,'*'))
print(operations(10,5,'/'))
print(operations(10,5,'%'))
print(operations(10,2,'**'))
print(operations(10,3,'//'))
print(operations((int(input("Enter a "))),int(input("Enter b ")),input("Enter c ")))'''
def evaluate():
    print(eval(input("Enter an arithmetic expression: ")))
evaluate()