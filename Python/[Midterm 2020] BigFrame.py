'''[Midterm 2020] BigFrame'''
def main():
    '''ตีกรอบ'''
    text1 = input().rstrip(" ")
    text2 = input().rstrip(" ")
    text3 = input().rstrip(" ")
    text4 = input().rstrip(" ")
    text5 = input().rstrip(" ")
    num = max(len(text1), len(text2), len(text3), len(text4), len(text5))
    print("**%s**" %("*"*num))
    print("* %s%s *" %(text1, " "*(num-len(text1))))
    print("* %s%s *" %(text2, " "*(num-len(text2))))
    print("* %s%s *" %(text3, " "*(num-len(text3))))
    print("* %s%s *" %(text4, " "*(num-len(text4))))
    print("* %s%s *" %(text5, " "*(num-len(text5))))
    print("**%s**" %("*"*num))
main()
