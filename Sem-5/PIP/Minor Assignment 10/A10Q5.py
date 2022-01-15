class Item:
    def __init__(self,name,price,quantity):
        self.name=name
        self.price=price
        self.quantity=quantity
    def purchase(self,item):
        if(item>self.quantity):
            print("Insufficent Quantity")
        else:
            self.quantity-=item
    def addStock(self,item):
        self.quantity+=item
    def __str__(self):
        return 'Name: '+self.name+"\nPrice: "+str(self.price)+"\nQuantity: "+str(self.quantity)
i=Item("Jam",200,200)
print(i)
i.addStock(200)
print('\n',i)
i.purchase(100)
print('\n',i)