class integrer:
    def romantoint(self, str):
        rom = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        num = 0
        for i in range(len(str)):
            if i > 0 and rom[str[i]] > rom[str[i - 1]]:
                num += rom[str[i]] - 2 * rom[str[i - 1]]
            else:
                num += rom[str[i]]
        return num

print(integrer().romantoint('CXL'))