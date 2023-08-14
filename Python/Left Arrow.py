'''Left Arrow'''
def main():
    '''No copy naaaa'''
    k_num = int(input())
    n_num = int(input())
    # process = "*" * k_num
    # for i in range():
    for i in range((n_num) // 2, 0, -1):
        for _ in range(i):
            print(" ", end="")
        print("*" * k_num)
    print("*" * k_num)
    for i in range(1, ((n_num) // 2) + 1):
        for _ in range(i):
            print(" ", end="")
        print("*" * k_num)
main()
