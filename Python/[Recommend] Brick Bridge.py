'''[Recommend] Brick Bridge'''
def brick_bridge():
    '''สร้างสะพาน'''
    a_num = int(input())
    b_num = int(input())
    goal = int(input())
    brick = 0
    if a_num + (b_num*5) < goal:
        print("-1")
    else:
        while goal > 0:
            if goal >= 5 and b_num > 0:
                goal -= 5
                b_num -= 1
            elif goal > 0 and a_num > 0:
                brick += 1
                goal -= 1
                a_num -= 1
        print(brick)
brick_bridge()
