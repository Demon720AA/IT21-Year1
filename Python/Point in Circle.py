'''Point in Circle'''
def main():
    '''จุดในวงกลม'''
    x_num = float(input())
    y_num = float(input())
    r_num = float(input())
    xn_num = float(input())
    yn_num = float(input())
    sqr_x = x_num * (r_num)**0.5
    sqr_y = y_num * (r_num)**0.5
    print(xn_num <= sqr_x and yn_num <= sqr_y)
main()
