'''Sequence I'''
def main():
    '''loop นับเลข'''
    num = int(input())
    for _ in range(num):
        for col in range(num):
            print(1+col, end=" ")
        print()
main()
