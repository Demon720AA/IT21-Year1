'''Triangle I'''
def triangle():
    '''เป็นสามเหลี่ยมมุมฉากหรือไม่'''
    num1 = float(input())
    num2 = float(input())
    num3 = float(input())
    if num1 >= num2 and num1 >= num3:
        z_num, x_num, y_num = num1, num2, num3
    elif num2 >= num1 and num2 >= num3:
        z_num, x_num, y_num = num2, num1, num3
    elif num3 >= num1 and num3 >= num2:
        z_num, x_num, y_num = num3, num1, num2
    if (x_num**2 + y_num**2)+0.01 >= z_num**2 and (x_num**2 + y_num**2)-0.01 <= z_num**2:
        print("Yes")
    else:
        print("No")
triangle()
