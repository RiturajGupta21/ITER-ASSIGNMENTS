def fun(file1,file2):
    lst=[]
    file1=open('file1.txt','r')
    file2=open('file2.txt','r')
    file3=open('file3.txt','w')
    for line in file1.read():   
        for word in line.split():   
                lst.append(word)
    i=0
    for line in file2.read():   
        for word in line.split():
            while(i<len(lst)):
                file3.write(str(int(word)/int(lst[i]))+",")
                i=i+1
fun('file1.txt','file2.txt')