'''HideAndSeek'''
def hide_and_seek():
    '''นับเลข X to Y range Z'''
    x_num = int(input())
    y_num = int(input())
    z_num = int(input())

    for num in range(x_num, y_num, z_num):
        print(num)
hide_and_seek()
