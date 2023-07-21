'''ODD_EVEN'''
def main():
    '''check Odd, even'''
    is_odd = int(input())
    print(("False" * (is_odd % 2 == 0)) + ("True" * (is_odd % 2 == 1)))
main()
