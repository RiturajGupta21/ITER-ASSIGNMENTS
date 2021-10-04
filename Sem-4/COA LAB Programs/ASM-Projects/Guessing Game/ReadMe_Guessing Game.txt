Guessing Game in Assembly

This assembly language program is designed to create a very simple game where user is allowed to guess a hard coded number between 1 and 255. 
This hard coded number can be replaced by a randomly generated number using a “random number generator” for EMU8086, 
which is bit complex because EMU8086 do not contain an instruction to do this implicitly. 
Program will output if guess is higher or lower than the input number. 
The code is well commented so that it can be used by anyone who is interested in learning assembly language.

Flow of the Program

System will print a message saying “Please enter a valid number:” Enter a number and *** Press ENTER *** key to continue.

The approach used to code this program made validating so easy. Because of that such features are implemented in this program. 
This system do NOT require user to enter a three degit numbers.

Ex : Inputs like 32,1 are valid. They will be converted to nemeric representation.

34 = 034 (Implicitly)
1 = 001 (Implicitly)

Also is users enter a value out of rage such as -1, 256,….. system will print:

“Error – Number out of range!”

Finally, it asks if user wants to retry, when a correct guess is made.
DEMO RUN

    *** means ‘Enter key’ is pressed ****

    Please enter a valid number: 0
    Value is More

    Please enter a valid number: 128
    Value is More

    Please enter a valid number: 170
    Value if Less

    Please enter a valid number: 255
    Value if Less

    Please enter a valid number: 256
    Error – Number out of range!

    Please enter a valid number: -1
    Error – Number out of range!

    Please enter a valid number: 3333
    Error – Number out of range!

    Please enter a valid number: 169
    You have made fine Guess!

    Retry [y/n] ?