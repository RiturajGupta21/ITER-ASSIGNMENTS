def frequencyCount(string):
    dic={}
    for ch in string:
        if ch in dic:
            dic[ch]=dic[ch]+1
        else:
            dic[ch]=1
    for ele in dic:
        print('Frequency Count Of',ele,'Is',dic[ele])
def main():
    string=input('Enter A String: ')
    frequencyCount(string)
if __name__=='__main__':
    main()
