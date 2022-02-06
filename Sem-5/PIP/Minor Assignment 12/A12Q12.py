class Card:
    def __init__(self, rank, suit):
        self.rank = rank
        self.suit = suit

    def getRank(self):
        return self.rank

    def getSuit(self):
        return self.suit

    def value(self):
        if self.rank <= 10:
            return self.rank
        else:
            return 10

    def names(self):
        ranks = ["Ace", "Two", "Three", "Four", "Five", "Six",
                 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"]
        suits = ["Diamond", "Clubs", "Hearts", "Spades"]
        name = ranks[self.rank-1]
        if self.suit == "d":
            name += suits[0]
        elif self.suit == "c":
            name += suits[1]
        elif self.suit == "h":
            name += suits[2]
        else:
            name += suits[3]
        return name

    def __str__(self):
        return str.format("({},{})", self.names(), self.value())


class DeckofCards(Card):
    def __init__(self, rank, suit):
        super().__init__(rank, suit)

    def sortedInsert(lst, compare):
        for index in range(1, len(lst)):
            value = lst[index]
            position = index
        while position > 0 and compare(lst[position - 1], value):
            lst[position] = lst[position - 1]
            position = position - 1
        lst[position] = value


A = DeckofCards(1, "d")
B = DeckofCards(13, "c")
C = DeckofCards(12, "s")
D = DeckofCards(9, "h")
lst = [A, B, C, D]
for i in lst:
    print(i)
print()
DeckofCards.sortedInsert(lst, lambda a, b: a.rank > b.rank)
for i in lst:
    print(i)
