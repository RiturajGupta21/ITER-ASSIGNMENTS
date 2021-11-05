import random
comp = 0 
player = 0
point = 1 
pointCom = 0
pointPlayer = 0
print("This is a game of Scissor-Rock-Paper.\n")

while((pointPlayer != 3) and (pointCom != 3)):
        print("\nEnter 1 for Scissor\nEnter 2 for Rock\nEnter 3 for Paper")
        player = int(input())
        comp = random.randint(1,3)

        if ((comp == 1) and (player == 3)):
            print("Scissor vs Paper.\nYou lose!")
            pointCom += point
        
        elif ((comp == 2) and (player == 1)):
            print("Rock vs Scissor.\nYou lose!")
            pointCom += point

        elif ((comp == 3) and (player == 2)):
            print("Paper vs Rock.\nYou lose!")
            pointCom += point

        elif ((comp == 1) and (player == 2)):
            print("Scissor vs Rock.\nYou win!")
            pointPlayer += point

        elif ((comp == 2) and (player == 3)):
            print("Rock vs Paper.\nYou win!")
            pointPlayer += point

        elif ((comp == 3) and (player== 1)):
            print("Paper vs Scissor.\nYou win!")
            pointPlayer += point

        elif ((comp == 1) and (player == 1)):
            print("Scissor vs Scissor.\nIt's a draw!")

        elif ((comp == 2) and (player == 2)):
            print("Rock vs Rock.\nIt's a draw!")

        elif ((comp == 3) and (player == 3)):
            print("Paper vs Paper.\nIt's a draw!")

        else:
            print("You can only choose between 1, 2, and 3...")
    
if (pointCom >= 3):
    print("\nYou LOST...")
elif (pointPlayer >= 3):
    print("\nYou WON...")