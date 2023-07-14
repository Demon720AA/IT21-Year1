'''[Pre] Hamberger'''
def main():
    '''Hamberger'''
    berger1 = int(input())
    berger2 = int(input())
    print(("|" * berger1) + ("*"*((berger1+berger2)*2)) + ("|"* berger2))
main()
