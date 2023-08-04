'''Seven'''
def main():
    '''หลักหน่วยของ 7 ยกกำลัง X'''
    x_num = float(input()) - 4000000
    if x_num % 4 == 1:
        print(7)
    elif x_num % 4 == 2:
        print(9)
    elif x_num % 4 == 3:
        print(3)
    elif x_num % 4 == 0:
        print(1)
main()
