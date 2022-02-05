import sys
def computemoderatemarks(file1,file2,addpercent):
    try:
        fin=open(file1,'r')
        fout=open(file2,'w')
    except IOError:
        print('problem in opening the file');sys.exit()
    line1=fin.readline()
    while(line1!=''):
        slist=line1.split(',')
        try:
            rollno=int(slist[0])
            name=slist[1]
            marks=int(slist[2])
        except IndexError:
            print('undefined index');sys.exit()
        except (ValueError):
            print('Unsuccessful conversion to int');sys.exit()
        maxmarks=100
        moderatemarks=marks+((addpercent*maxmarks)/100)
        if moderatemarks>100:
            moderatemarks=100
        fout.write(str(rollno)+','+name+','+str(moderatemarks)+'\n')
        line1=fin.readline()
        fin.close()
        fout.close()
def main():
    file1='file1.txt'
    file2='file2.txt'
    addpercent=int(input('enter moderation percentage: '))
    computemoderatemarks(file1,file2,addpercent)
if __name__ == '__main__':
    main()
