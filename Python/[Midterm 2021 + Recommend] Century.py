'''[Midterm 2021 + Recommend] Century'''
def process(year):
    '''แปลงค่า'''
    num_year = year[5:]
    # print(num_year)
    if year[0:4] == "A.D.":
        process1 = (int(num_year)+99)//100
        if process1 > 0:
            print(process1)
        else:
            print("ERROR")

    elif year[0:4] == "B.E.":
        num_year = int(num_year) - 543
        process1 = (int(num_year)+99)//100
        if process1 > 0:
            print(process1)
        else:
            print("ERROR")

def inp():
    '''input'''
    line = int(input())
    for _ in range(line):
        year = input()
        process(year)
inp()
