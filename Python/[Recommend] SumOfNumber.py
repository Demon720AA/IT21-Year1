'''[Recommend] SumOfNumber'''
def plus_num_loop():
    '''loop plus num'''
    keep_num = 0
    set_num = int(input())
    while True:
        number = int(input())
        keep_num += number
        if number == -1:
            keep_num += 1
            break
        elif keep_num == set_num:
            break
    print(keep_num)
plus_num_loop()
