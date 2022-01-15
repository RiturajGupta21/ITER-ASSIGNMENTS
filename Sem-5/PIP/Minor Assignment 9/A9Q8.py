def percentage(marks, total):
    try:
        percent = (marks / total) * 100
    except ValueError:
        print('ValueError')
    except TypeError:
        print('TypeError')
    except ZeroDivisionError:
        print('ZeroDivisionError')
    except:
        print('Any other Error')
    else:
        print(percent)
    finally:
        print('Function percentage completed')
percentage('150.0','200.0')