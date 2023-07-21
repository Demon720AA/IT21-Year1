'''BMI'''
def main():
    '''asdf'''
    wei1 = float(input())
    tal1 = float(input())
    bmi = (wei1/(tal1/100)**2)
    if bmi < 18.5:
        print("Underweight")
    elif 18.5 <= bmi < 25:
        print("Normal")
    elif 25 <= bmi < 30:
        print("Overweight")
    else:
        print("Obese")
main()
