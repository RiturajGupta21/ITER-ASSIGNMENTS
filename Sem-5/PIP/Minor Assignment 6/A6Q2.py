def checkAnagrams(str,str1):
    resstr=''.join(sorted(str))
    resstr1=''.join(sorted(str1))
    if(resstr==resstr1):
        return True
    else:
        return False
print(checkAnagrams("kutta","tutka"))    