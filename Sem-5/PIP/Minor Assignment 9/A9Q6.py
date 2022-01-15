def countAll(file1):
    file1 = open('Poem.txt', 'r')
    data = file1.read()
    alphabets = 0
    blanks = 0
    lower = 0
    upper = 0
    wordsV = 0
    beau = data.count('beautiful')
    for i in range(len(data)):
        if data[i].isalpha():
            alphabets += 1
            if data[i].isupper():
                upper += 1
            else:
                lower += 1
        if data[i] == ' ':
            blanks += 1
            if data[i+1] in 'aeiouAEIOU':
                wordsV += 1

    print('no of alphabets = ', alphabets)
    print('no of blank spaces = ', blanks)
    print('no of upper case = ', upper)
    print('no of lower case =', lower)
    print('no of words starting vowels  =', wordsV)
    print('no of word beautiful =', beau)


file1 = open('Poem.txt', 'r')
countAll(file1)
