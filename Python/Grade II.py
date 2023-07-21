'''Grade II'''
def main():
    '''คิดคะแนน'''
    grade = float(input())
    if grade <= 100 and 0 <= grade:
        print(("A" * (grade >= 95)) + ("B+" * (grade >= 90 and grade < 95)) + \
("B" * (grade >= 85 and grade < 90)) + ("C+" * (grade >= 80 and grade < 85)) + \
("C" * (grade >= 75 and grade < 80)) + ("D+" * (grade >= 70 and grade < 75)) + \
("D" * (grade >= 65 and grade < 70)) + ("F+" * (grade >= 60 and grade < 65)) + \
("F" * (grade < 60)))
    else:
        print("ERR")
main()
