'''[Midterm 2020] One For All'''
def one_for_all():
    '''ไอพอยมึนครับ'''
    number = int(input())
    text = ""
    for cal in range(number):
        name = input()
        if (cal+1) == 1:
            text += name
        elif (cal+1) % 2 == 0:
            text = text + ("*"*cal) + name
        elif (cal+1) % 2 == 1:
            text = text + ("-"*cal) + name
    if number > 0:
        print("%s_%d" %(text, number))
one_for_all()
