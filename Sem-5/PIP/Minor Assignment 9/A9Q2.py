def fun(file1):
    file1=open('file1.txt','w')
    file1.write('welcome to iter')
    file1.write('\nSOA Deemed to be University')
    file1=open('file1.txt','r')
    word_count=0
    vowels_count=0
    str=file1.read()
    for ch in str:
            if( ch=='A' or ch=='a' or ch=='E' or ch=='e' or ch=='I' or ch=='i' or ch=='O' or ch=='o' or ch=='U' or ch=='u'):
                vowels_count +=1
    words=str.split()
    word_count=word_count+len(words)
    print(vowels_count)
    print(word_count)
    file1.close()
fun('file1.txt')