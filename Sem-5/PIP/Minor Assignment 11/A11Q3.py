'''
a)Data Hiding (Include advantages and disadvatage of data hiding)
Data hiding is a concept which underlines the hiding of data or information from the user.
It is one of the key aspects of Object-Oriented programming strategies.
It includes object details such as data members, internal work.
Data hiding excludes full data entry to class members and defends object integrity by preventing unintended changes. 
Data hiding also minimizes system complexity for increase robustness by limiting interdependencies between software requirements. 
Data hiding is also known as information hiding. 
In class, if we declare the data members as private so that no other class can access the data members, 
then it is a process of hiding data.
Advantages of Data Hiding:
    It helps to prevent damage or misuse of volatile data by hiding it from the public.
    The class objects are disconnected from the irrelevant data.
    It isolates objects as the basic concept of OOP.
    It increases the security against hackers that are unable to access important data.
Disadvantages of Data Hiding:
    It enables programmers to write lengthy code to hide important data from common clients.
    The linkage between the visible and invisible data makes the objects work faster, but data hiding prevents this linkage.

b)Encapsulation enables us to group together related data and its associated functions under one name.

c)Modifier and Accessor Methods
The methods in the class definition that modify the value of one or more arguments are known as modifiers.
For example, the methods setAddress and setName in the class Person are modifiers since they change the values
of the data attributes address and name respectively associated with parameter self.
However, methods such as getAddress and getName of the class MyDate only access (do not modify) the data attributes address
and name of the object self. Such methods are known as accessors.

d)Static Method used for modifying class data members and do not require passing object as the first parameter

e)Inheritance is an important feature of object oriented programming that imparts ability to a class to inherit
properties and behavior of another class.
'''