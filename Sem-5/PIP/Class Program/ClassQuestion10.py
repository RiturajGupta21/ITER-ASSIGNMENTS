
x = int(input('Enter value for x:'))
y = int(input('Enter value for y:'))
if x > 0 and y > 0:
    print('First quadrant')
elif x < 0 and y > 0:
    print('Second quadrant')
elif x < 0 and y < 0:
    print('Third quadrant')
elif x > 0 and y < 0:
    print('Fourth quadrant')
else: 
    print('At Origin')