subject='computer'
subject=list(subject)
ch = subject[0]
for i in range(0,len(subject)-1):
    subject[i]=subject[i+1]
subject[len(subject)-1]=ch
print(''.join(subject))
