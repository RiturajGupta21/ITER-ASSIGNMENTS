def replaceWithStar(str):
   strres=''
   for i in range(0,len(str)):
      if str[i]==str[i-1]:
         strres=strres[:i+1]+'*'
      else:
         strres+=str[i]
   return strres
print(replaceWithStar('balloon'))