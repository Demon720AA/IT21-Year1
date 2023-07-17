'''Timing II'''
def main():
    '''นับเวลา'''
    sec = int(input())
    mint = sec // 60
    sec = sec % 60
    hor = mint // 60
    mint = mint % 60
    day = hor // 24
    hor = hor % 24
    print(("%04d:%02d:%02d:%02d" %(day, hor, mint, sec) * (day < 10000))\
 + ("ERR_:__:__:__" * (day >= 10000)))
main()
