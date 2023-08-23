'''[Recommend] Grade III'''
def range_grade(score):
    '''range grade'''
    score = ((4 * (score >= 95)) + (3.5 * (score >= 90 and score < 95)) + \
(3 * (score >= 85 and score < 90)) + (2.5 * (score >= 80 and score < 85)) + \
(2 * (score >= 75 and score < 80)) + (1.5 * (score >= 70 and score < 75)) + \
(1 * (score >= 65 and score < 70)) + (0.5 * (score >= 60 and score < 65)) + \
(0 * (score < 60)))
    return score
def grade():
    '''หาเกรดเฉลี่ย'''
    grade_average = 0
    lap = int(input())
    for _ in range(lap):
        score = float(input())
        score = range_grade(score)
        grade_average = grade_average + score
    grade_average = (grade_average/lap)*100
    print("%.2f" %(int(grade_average)/100))
grade()
