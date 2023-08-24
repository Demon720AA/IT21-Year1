'''Largest Number'''
def largset_number():
    '''เรียงเลข'''
    first_num = input()
    secound_num = input()
    last_num = input()
    set_1 = int(first_num + secound_num + last_num)
    set_2 = int(first_num + last_num + secound_num)
    set_3 = int(secound_num + first_num + last_num)
    set_4 = int(secound_num + last_num + first_num)
    set_5 = int(last_num + first_num + secound_num)
    set_6 = int(last_num + secound_num + first_num)
    if set_1 >= set_2 and set_1 >= set_3 and set_1 >= set_4 and \
set_1 >= set_5 and set_1 >= set_6:
        print(set_1)
    elif set_2 >= set_1 and set_2 >= set_3 and set_2 >= set_4 and \
set_2 >= set_5 and set_2 >= set_6:
        print(set_2)
    elif set_3 >= set_1 and set_3 >= set_2 and set_3 >= set_4 and \
set_3 >= set_5 and set_3 >= set_6:
        print(set_3)
    elif set_4 >= set_1 and set_4 >= set_2 and set_4 >= set_3 and \
set_4 >= set_5 and set_4 >= set_6:
        print(set_4)
    elif set_5 >= set_1 and set_5 >= set_2 and set_5 >= set_3 and \
set_5 >= set_4 and set_5 >= set_6:
        print(set_5)
    elif set_6 >= set_1 and set_6 >= set_2 and set_6 >= set_3 and \
set_6 >= set_4 and set_6 >= set_5:
        print(set_6)
largset_number()
