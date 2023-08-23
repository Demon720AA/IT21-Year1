'''Triangle I'''
def triangle():
    '''เป็นสามเหลี่ยมมุมฉากหรือไม่'''
    x_num = float(input())
    y_num = float(input())
    z_num = float(input())
    if (x_num**2 + y_num**2)+0.01 >= z_num**2 and (x_num**2 + y_num**2)-0.01 <= z_num**2:
        print("Yes")
    else:
        print("No")
triangle()
