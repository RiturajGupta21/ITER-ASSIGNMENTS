'''
try:
    f = open('file1.txt', 'r')
except IOError:
    print('Problem with Input Output...\n')
else:
    print('No Problem with Input Output...')

'''
try:
    f = open('file1.txt', 'w')
except IOError:
    print('Problem with Input Output...\n')
else:
    print('No Problem with Input Output...')
