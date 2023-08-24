'''GraderMachine'''
def even_number():
    '''even in range(x, y)'''
    start_num = int(input())
    stop_num = int(input())
    keep_text = ""
    keep_num = 0
    if start_num >= stop_num:
        for num in range(start_num, stop_num-1, -1):
            if num % 2 == 0:
                keep_text += str(num) + " "
                keep_num += num
    else:
        for num in range(start_num, stop_num+1):
            if num % 2 == 0:
                keep_text += str(num) + " "
                keep_num += num
    print("pass : %s" %(keep_text))
    print("Sum : %d" %(keep_num))
even_number()
