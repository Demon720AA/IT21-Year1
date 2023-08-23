'''PlanCDEFGHIJKLMNOPQRSTUVWXYZ'''
def main():
    '''เรียงเลข'''
    ad_in = input()
    num1 = float(input())
    num2 = float(input())
    num3 = float(input())

    if ad_in == "Ascend":
        ascend(num1, num2, num3)
    if ad_in == "Descend":
        descend(num1, num2, num3)

def ascend(num1, num2, num3):
    '''น้อยไปมาก'''
    if num1 <= num2 and num2 <= num3:
        print("%.2f, %.2f, %.2f" %(num1, num2, num3))
    elif num1 <= num3 and num3 <= num2:
        print("%.2f, %.2f, %.2f" %(num1, num3, num2))
    elif num2 <= num1 and num1 <= num3:
        print("%.2f, %.2f, %.2f" %(num2, num1, num3))
    elif num2 <= num3 and num3 <= num1:
        print("%.2f, %.2f, %.2f" %(num2, num3, num1))
    elif num3 <= num1 and num1 <= num2:
        print("%.2f, %.2f, %.2f" %(num3, num1, num2))
    elif num3 <= num2 and num2 <= num1:
        print("%.2f, %.2f, %.2f" %(num3, num2, num1))

def descend(num1, num2, num3):
    '''มากไปน้อย'''
    if num1 >= num2 and num2 >= num3:
        print("%.2f, %.2f, %.2f" %(num1, num2, num3))
    elif num1 >= num3 and num3 >= num2:
        print("%.2f, %.2f, %.2f" %(num1, num3, num2))
    elif num2 >= num1 and num1 >= num3:
        print("%.2f, %.2f, %.2f" %(num2, num1, num3))
    elif num2 >= num3 and num3 >= num1:
        print("%.2f, %.2f, %.2f" %(num2, num3, num1))
    elif num3 >= num1 and num1 >= num2:
        print("%.2f, %.2f, %.2f" %(num3, num1, num2))
    elif num3 >= num2 and num2 >= num1:
        print("%.2f, %.2f, %.2f" %(num3, num2, num1))

main()
