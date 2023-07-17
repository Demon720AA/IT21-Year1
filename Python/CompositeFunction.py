'''CompositeFunction'''
def main():
    '''main'''
    def f_cal(x_num):
        '''f(x)'''
        return 2 * x_num
    def g_cal(x_num):
        '''g(x)'''
        return x_num/2 + 1
    x_num = int(input())
    print("%.2f" %f_cal(g_cal(x_num)))
    print("%.2f" %g_cal(f_cal(x_num)))
main()
