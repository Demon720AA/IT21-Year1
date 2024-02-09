"""Summation (Type 1)"""
def summation(num):
    """plus 1 to num"""
    answer = 0
    for i in range(1, num + 1):
        answer += i
    print(answer)
summation(int(input()))
