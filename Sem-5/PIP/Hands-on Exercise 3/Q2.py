ch=input("Enter a char -> ")
ch=ord(ch)
if (ch>=65 and ch<=90):
		print("Character is a capital letter")
elif (ch>=97 and ch<=122):
	print("Character is a small letter")
elif (ch>=48 and ch<=57):
	print("Character is a digit")
elif ((ch>0 and ch<=47) or (ch>=58 and ch<=64) or (ch>=91 and ch<=96) or (ch>=123 and ch<=127)):
	print("Character is a special symbol")