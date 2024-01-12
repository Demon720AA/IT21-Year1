'''Lab 01.02'''
import json
def main():
    '''bye'''
    my_list = json.loads(input())
    check_h = my_list[0]
    check_l = my_list[0]
    for i in range(len(my_list)):
        if my_list[i] > check_h:
            check_h = my_list[i]
        if my_list[i] < check_l:
            check_l = my_list[i]
    aver = sum(my_list)/len(my_list)
    thistuple = (check_h, check_l, round(aver, 2))
    print(thistuple)
main()
