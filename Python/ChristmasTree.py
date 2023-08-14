"""ChristmasTree"""
def christmas():
    '''คริสมาส'''
    num_n = int(input())
    num_x = 1
    num_k = int(input())
    for col in range(0, num_n):
        for col in range(0, num_n-1):
            print("", end="")
        for col in range(0, num_x):
            print("*", end="")
        for col in range(0, num_n-1):
            print("", end="")
        num_x *= 2
        num_x -= 1
        num_n -= 1
        print()
christmas()
