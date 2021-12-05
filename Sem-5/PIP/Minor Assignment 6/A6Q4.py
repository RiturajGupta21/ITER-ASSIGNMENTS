def convert(str):
	ch = list(str)
	for i in range(len(str)):
		if (i == 0 and ch[i] != ' ' or ch[i] != ' ' and ch[i - 1] == ' '):
			if (ch[i] >= 'a' and ch[i] <= 'z'):
				ch[i] = chr(ord(ch[i]) - ord('a') + ord('A'))
		elif (ch[i] >= 'A' and ch[i] <= 'Z'):
			ch[i] = chr(ord(ch[i]) + ord('a') - ord('A'))
	resstr = "".join(ch)
	return resstr	
print(convert("Hello wElcome 231"))