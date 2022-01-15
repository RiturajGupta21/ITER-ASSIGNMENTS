f = open('PYTHON', 'w')
description =['we either choose the pain of discipline \n', 'or\n' 'the pain of regret\n']
f.writelines(description)
f.close()
f = open('PYTHON', 'r')
print(f.read())
f.close()