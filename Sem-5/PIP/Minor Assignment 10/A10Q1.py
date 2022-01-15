class roman:
    def intRoman(self, n):
        num = [1000, 900,  500, 400, 100,  90, 50,  40, 10,  9,   5,  4,   1]
        rom = ['M',  'CM', 'D', 'CD','C', 'XC','L','XL','X','IX','V','IV','I']
        res = ''
        for i in range(len(num)) :
            temp = int(n / num[i])
            res += str(rom[i] * temp)
            n -= num[i] * temp
        print(res)
roman().intRoman(990)