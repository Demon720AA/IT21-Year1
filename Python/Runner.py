'''Runner'''
def runner():
    '''วนซ้ำกำหนดค่า'''
    text = input()
    loop_num = int(input())
    for _ in range(loop_num):
        print(text)
runner()
