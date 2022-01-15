def fun(file1):
    file1=open('file1.text','w')
    s1=input(('enter a sentence :-'))
    while(s1!=''):
        file1.write(s1.capitalize())
        s1=input(('enter a sentence :-'))
    file1.close()
    file1=open('file1.text','r')
    print(file1.read())
fun('file1.txt')