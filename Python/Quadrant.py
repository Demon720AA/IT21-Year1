'''Quadrant'''
def main():
    '''หา Quadrant #Q1, Q2, Q3, Q4'''
    x_num = int(input())
    y_num = int(input())
    print(("Q1" * (x_num > 0 and y_num > 0)) + ("Q2" * (x_num < 0 and y_num > 0)) + \
("Q3" * (x_num < 0 and y_num < 0)) + ("Q4" * (x_num > 0 and y_num < 0)) + \
("X" * (x_num == 0 and (y_num > 0 or y_num < 0))) + ("Y" * (y_num == 0 and \
(x_num > 0 or x_num < 0))) + ("O" * (x_num == 0 and y_num == 0)))
main()
