'''Largest Number'''
def largset_number():
    '''เรียงเลข'''
    first_num = input()
    secound_num = input()
    last_num = input()
    set_1 = first_num + secound_num + last_num
    set_2 = first_num + last_num + secound_num
    set_3 = secound_num + first_num + last_num
    set_4 = secound_num + last_num + first_num
    set_5 = last_num + first_num + secound_num
    set_6 = last_num + secound_num + first_num
    if int(set_1) >= int(set_2) and int(set_1) >= int(set_3) and int(set_1) >= int(set_4) and \
int(set_1) >= int(set_5) and int(set_1) >= int(set_6):
        print(set_1)
    elif int(set_2) >= int(set_1) and int(set_2) >= int(set_3) and int(set_2) >= int(set_4) and \
int(set_2) >= int(set_5) and int(set_2) >= int(set_6):
        print(set_2)
    elif int(set_3) >= int(set_1) and int(set_3) >= int(set_2) and int(set_3) >= int(set_4) and \
int(set_3) >= int(set_5) and int(set_3) >= int(set_6):
        print(set_3)
    elif int(set_4) >= int(set_1) and int(set_4) >= int(set_2) and int(set_4) >= int(set_3) and \
int(set_4) >= int(set_5) and int(set_4) >= int(set_6):
        print(set_4)
    elif int(set_5) >= int(set_1) and int(set_5) >= int(set_2) and int(set_5) >= int(set_3) and \
int(set_5) >= int(set_4) and int(set_5) >= int(set_6):
        print(set_5)
    elif int(set_6) >= int(set_1) and int(set_6) >= int(set_2) and int(set_6) >= int(set_3) and \
int(set_6) >= int(set_4) and int(set_6) >= int(set_5):
        print(set_6)
largset_number()
