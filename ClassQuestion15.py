def authnticateUser(password):
    if password=='magic':
        message='Login Successfull\n Welcome to System'
    if password != 'magic':
        message='Password mismatch \n'
    return message
def main():
    print('\t Login System ')
    print('======================')
    password=input("Enter Password ")
    message=authnticateUser(password)
    print(message)
if __name__ == '__main__':
    main()