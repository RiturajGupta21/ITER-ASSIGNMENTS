def isPalindrome(word):
    return word == word[::-1]
n = input("Enter Input: ")
print(isPalindrome(n))
