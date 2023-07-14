'''[Pre] Blackjack'''
def main():
    '''เล่นไพ่'''
    nub = int(input())
    check_1 = "2", "3", "4", "5", "6", "7", "8", "9", "10"
    check_2 = "J", "Q", "K"
    process = 0
    process_a = 0
    for _ in range(nub):
        point = input()
        if point in check_1:
            process = process +int(point)
        elif point in check_2:
            process = process + 10
        elif point == "A":#check A
            process_a = process_a + 1
    if process_a == 3:
        print(process + 13)
    elif process_a == 2:
        if process + 12 <= 21:
            print(process + 12)
        else:
            print(process + 2)
    elif process_a == 1:
        if process + 11 <= 21:
            print(process + 11)
        else:
            print(process + 1)
    else:
        print(process)
main()
    