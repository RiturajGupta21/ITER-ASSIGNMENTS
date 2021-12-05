def a1(str):
    print(str[::-1])
def a2(str):
    list=str.split()
    print(" ".join(list[::-1]))
def a3(str):
    if str[:(len(str)//2)]==str[(len(str)//2):]:
        print("Symmetric")
    else:
        print("Asymmetric")
def a4(str):
    if str==str[::-1]:
        print("Palindrome")
    else:
        print("Not a palindrome")
def a5(str,i):
    print(str[:i]+str[i+1:])
def a6(str,vowel):
    str=str.lower()
    list = [each for each in str if each in vowel]
    print(len(list)," ",len(str)-len(list))
def a7(str):
    c=0
    for i in str:
        c+=1
    print(c)
def a8(str):
    print(str.isalnum())
def a9(str):
    print("".join(set(str)))
def a10(str):
    temp = {} 
    for i in str: 
        if i in temp: 
            temp[i] += 1
        else: 
            temp[i] = 1
    return temp
def a11(str):
    dict=a10(str)
    max_fre=max(dict, key=dict.get)
    print(max_fre)
def a12(str,str1):
    print(sorted(str) == sorted(str1))
if __name__ =='__main__':
    a1("welcome to iter")
    a2("welcome to iter")
    a3("khokho")
    a4("amaama")
    a5("hello",2)
    a6("amaama","aeiou")
    a7("welcome to iter")
    a8("hey123")
    a9("amaama")
    print(a10("amaama"))
    a11("amaama")
    a12("silent","listen")
