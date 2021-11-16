import pdb
pdb.set_trace()
def max3(n1, n2, n3):
    '''
    Objective: To find maximum of three numbers
    Input Parameters: n1,n2,n3 - numeric values
    Return Value: maxNumber - numeric value
    '''
    maxNumber=0
    if n1 > n2 :
        if n1 > n3:
            maxNumber = n1
    elif n2 > n3:
        maxNumber=n2
    else:
        maxNumber = n3
    return maxNumber
def main():
    '''
    Objective: To find maximum of three numbers
    Input Parameter: None
    Return Value: None
    '''
    n1 = int(input('Enter first number: '))
    n2 = int(input('Enter second number: '))
    n3 = int(input('Enter third number: '))
    maximum = max3(n1,n2,n3)
    print('Maximum number is:',maximum)
if __name__ == "__main__":
    main()
    























    
# Windows PowerShell
# Copyright (C) Microsoft Corporation. All rights reserved.

# Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

# PS C:\Users\ritur\Documents\PIP> & C:/Python310/python.exe c:/Users/ritur/Documents/PIP/max3.py
# > c:\users\ritur\documents\pip\max3.py(3)<module>()
# -> def max3(n1, n2, n3):
# (Pdb) h

# Documented commands (type help <topic>):
# ========================================
# EOF    c          d        h         list      q        rv       undisplay
# a      cl         debug    help      ll        quit     s        unt
# alias  clear      disable  ignore    longlist  r        source   until
# args   commands   display  interact  n         restart  step     up
# b      condition  down     j         next      return   tbreak   w
# break  cont       enable   jump      p         retval   u        whatis
# bt     continue   exit     l         pp        run      unalias  where

# Miscellaneous help topics:
# ==========================
# exec  pdb

# (Pdb) h s
# s(tep)
#         Execute the current line, stop at the first possible occasion
#         (either in a function that is called or in the current
#         function).
# (Pdb) s
# > c:\users\ritur\documents\pip\max3.py(18)<module>()
# -> def main():
# (Pdb) s
# > c:\users\ritur\documents\pip\max3.py(29)<module>()
# -> if __name__ == "__main__":
# (Pdb) s
# > c:\users\ritur\documents\pip\max3.py(30)<module>()
# -> main()
# (Pdb) s
# --Call--
# > c:\users\ritur\documents\pip\max3.py(18)main()
# -> def main():
# (Pdb) s
# > c:\users\ritur\documents\pip\max3.py(24)main()
# -> n1 = int(input('Enter first number: '))
# (Pdb) l
#  19         '''
#  20         Objective: To find maximum of three numbers
#  21         Input Parameter: None
#  22         Return Value: None
#  23         '''
#  24  ->     n1 = int(input('Enter first number: '))
#  25         n2 = int(input('Enter second number: '))
#  26         n3 = int(input('Enter third number: '))
#  27         maximum = max3(n1,n2,n3)
#  28         print('Maximum number is:',maximum)
#  29     if __name__ == "__main__":
# (Pdb) n
# Enter first number: 20
# > c:\users\ritur\documents\pip\max3.py(25)main()
# -> n2 = int(input('Enter second number: '))
# (Pdb) n
# Enter second number: 10
# > c:\users\ritur\documents\pip\max3.py(26)main()
# -> n3 = int(input('Enter third number: '))
# (Pdb) n
# Enter third number: 30
# > c:\users\ritur\documents\pip\max3.py(27)main()
# -> maximum = max3(n1,n2,n3)
# (Pdb) p(n1,n2,n3)
# (20, 10, 30)
# (Pdb) n
# > c:\users\ritur\documents\pip\max3.py(28)main()
# -> print('Maximum number is:',maximum)
# (Pdb) n          
# Maximum number is: 0
# --Return--
# > c:\users\ritur\documents\pip\max3.py(28)main()->None
# -> print('Maximum number is:',maximum)