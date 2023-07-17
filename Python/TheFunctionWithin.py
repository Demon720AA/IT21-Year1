'''TheFunctionWithin'''
def f_x(x_num):
    '''f(x)'''
    return x_num*2
def g_x(x_num):
    '''g(x)'''
    return 3 * (x_num**4) - x_num**3 + 2 * (x_num**2) + 10
def h_xyz(x_num, y_num, z_num):
    '''h(x,y,z)'''
    return (z_num + x_num)**2 - (x_num * y_num) + y_num**2
def i_abcd(a_num, b_num, c_num, d_num):
    '''i(a,b,c,d)'''
    return ((a_num**2) + (b_num**2) - (c_num**2)) / ((d_num**2) - 2 * (a_num*d_num) + (2 * a_num))
def main():
    '''function'''
    a_num = float(input())
    b_num = float(input())
    c_num = float(input())
    d_num = float(input())
    print(f_x(f_x(a_num)))
    print(g_x(f_x(a_num - b_num)))
    print(h_xyz(f_x(a_num + b_num), f_x(a_num + c_num), g_x(f_x(d_num**2))))
    print(i_abcd(h_xyz(f_x(a_num + b_num), f_x(a_num - c_num), g_x(f_x(d_num**2))), \
g_x(f_x(a_num - b_num)), f_x(f_x(f_x(f_x(f_x(c_num))))), d_num**8))
main()
