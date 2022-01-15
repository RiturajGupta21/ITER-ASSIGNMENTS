def inverse1():
    try:
        num = input('Enter the number: ')
        num = float(num)
        inverse = 1.0 / num
    except ValueError:
        print('ValueError')
    except TypeError:
        print('TypeError')
    except ZeroDivisionError:
        print('ZeroDivisionError')
    except:
        print('Any other Error')
    else:
        print(inverse)
    finally:
        print('Function inverse completed')
inverse1()