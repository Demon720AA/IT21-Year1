'''[Midterm 2020] Phone Number'''
def phone():
    '''เขียนหมายเลขโทรศัพท์'''
    number = input()
    num_format = input()
    if num_format == "Domestic":
        if len(number) == 10:
            print("%s %s %s" %(number[0:2], number[2:6], number[6:10]))
        else:
            print("%s %s %s" %(number[0], number[1:5], number[5:10]))
    elif num_format == "International":
        if len(number) == 10:
            print("+66%s %s %s" %(number[1], number[2:6], number[6:10]))
        else:
            print("+66 %s %s" %(number[1:5], number[5:10]))
phone()
