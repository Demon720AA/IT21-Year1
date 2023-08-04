'''Point in Circle'''
def main():
    '''จุดในวงกลม'''
    x_num = float(input())
    y_num = float(input())
    r_num = float(input())
    xn_num = float(input())
    yn_num = float(input())
    print((((xn_num - x_num)**2)+((yn_num - y_num)**2) <= r_num**2))
main()
