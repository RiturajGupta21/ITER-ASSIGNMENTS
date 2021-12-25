def strtoint(str):
    if len(str)==0:
        return 0
    return strtoint(str[:-1])*10+ord(str[-1])-48
print(strtoint("1234"))