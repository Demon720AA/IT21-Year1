'''Table I'''
def table():
    '''15 x n ='''
    num = int(input())
    for lap in range(num):
        print("15 x %d = %d" %(lap + 1, 15 * (lap+1)))
table()
