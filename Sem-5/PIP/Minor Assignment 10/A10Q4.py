class BankAccount:
    account_number = 0
    name = ""
    balance_amount = 0

    def account_creation(self):
        self.account_number = int(input("Enter the account number\t"))
        self.name = input("Enter the account holder name\t")

    def amount_deposition(self, amount):
        self.balance_amount = self.balance_amount + amount

    def amount_withdrawn(self, amount):
        if(amount<=self.balance_amount):
            self.balance_amount = self.balance_amount - amount
        else:
            print("Less Ammount")
    def display_account(self):
        print("Name: ",self.name,"\tAccount Number: ",self.account_number,"\tBalance: ",self.balance_amount)
ch=''
acc=BankAccount()
while ch!=5:
    print("\tMAIN MENU\t")
    print("\t1. NEW ACCOUNT\t")
    print("\t2. DEPOSIT AMOUNT\t")
    print("\t3. WITHDRAW AMOUNT\t")
    print("\t4. BALANCE ENQUIRY\t")
    print("\t5. EXIT\t")
    ch=int(input())
    if ch==1:
        acc.account_creation()
    elif ch==2:
        print("Test")
        acc.amount_deposition(int(input()))
    elif ch==3:
        acc.amount_withdrawn(int(input()))
    elif ch==4:
        acc.display_account()
    elif ch==5:
        break
