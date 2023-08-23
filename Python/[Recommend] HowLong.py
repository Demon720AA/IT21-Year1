'''[Recommend] HowLong'''
def how_long():
    '''why band len'''
    num = abs(int(input()))
    keep = 0
    while True:
        if num < 10:
            keep += 1
            break
        else:
            num //= 10
            keep += 1
    print(keep)
how_long()
