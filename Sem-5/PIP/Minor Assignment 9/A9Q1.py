def fun(file1,file2):
    file1=open('file1.txt','w')
    file1.write('welcome to iter')
    file1.write('\nSOA Deemed to be University')
    file1.close()
    with open('file1.txt','r') as file1:
        with open('file2.txt','w') as file2:
           for line in file1:
              file2.write(line)
    file2.close()
fun('file1.txt','file2.txt')