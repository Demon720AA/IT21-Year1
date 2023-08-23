'''Frame'''
def frame():
    '''input'''
    text = input()
    print("*", ("*"*len(text)), "*", sep="")
    print("*", text, "*", sep="")
    print("*", ("*"*len(text)), "*", sep="")
frame()
