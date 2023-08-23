'''[Midterm 2020] BTSMRT'''
def train():
    '''ต้องจ่ายค่าขึ้นไหม'''
    day_check = input()
    age = float(input())
    tall = float(input())

    if day_check == "Children Day": #เช็คว่าวันเด็กหรือเปล่า
        if age < 14 and tall <= 140:
            print("FREE")
        else:
            print("PAY")

    elif day_check == "Senior Day": #เช็คว่าวันผู้สูงอายุหรือเปล่า
        if age >= 60:
            print("FREE")
        elif age < 14 and tall < 90:
            print("FREE")
        else:
            print("PAY")

    else:
        if age < 14 and tall < 90:
            print("FREE")
        else:
            print("PAY")

train()
