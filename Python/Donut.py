'''Donut'''
def donut_price():
    '''จำนวนเงินที่ต้องจ่าย'''
    a_num = int(input()) #ราคาต่อชิ้น
    b_num = int(input()) #ซื้อกี่ชิ้นจะแถม
    c_num = int(input()) #แถมกี่ชิ้น
    d_num = int(input()) #ซื้อกี่ชิ้น
    process1 = b_num+c_num #ชิ้นที่ซื้อ+ชิ้นที่แถม
    process2 = d_num//process1
    if d_num == 0:
        print("0 0")
    else:
        donut = process1 * process2
        process3 = d_num - donut
        if process3 > b_num:
            process3 = b_num
        if process3 == b_num:
            donut += process1
        else:
            donut += process3
        print("%d %d" %((a_num*process2*b_num)+(process3*a_num), donut))
donut_price()
