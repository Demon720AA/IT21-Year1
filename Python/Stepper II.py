'''Stepper II'''
def main():
    '''เรียงเลข'''
    num1 = int(input())
    num2 = int(input())
    if num2 >= num1:
        for _ in range(abs(num2-num1)+1):
            print(num1)
            num1 += 1
    elif num2 < num1:
        for _ in range(abs(num2-num1)+1):
            print(num1)
            num1 -= 1
main()
    