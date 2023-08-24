'''[Recommend] Brick Bridge'''
def brick_bridge():
    '''สร้างสะพาน'''
    a_num = int(input())
    b_num = int(input())
    goal = int(input())
    if a_num + (b_num*5) < goal or b_num % 5 > a_num:
        print("-1")
    else:
        if b_num * 5 >= goal:
            print(goal % 5)
        else:
            print(goal - (b_num * 5))
brick_bridge()
