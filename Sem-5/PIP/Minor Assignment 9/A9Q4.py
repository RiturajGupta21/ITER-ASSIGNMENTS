def fun(file1, file2):
    file1=open('file1.txt','w')
    file1.write(''' Hello world
    this is good
    how to save you
    ''')
    file1.close()
    try:
        file1=open('file1.txt' , 'r')
        file2=open('file2.txt','w')

    except IOError:
        print('File does not exist')

    content = file1.readlines()
    type(content)
    for i in range(0, len(content)):
        if i % 2 == 0:
            file2.write(content[i])
        else:
            pass
    file2.close()
fun('file1.txt', 'file2.txt')