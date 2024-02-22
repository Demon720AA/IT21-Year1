"""Labs 11.05 - Seats Number (Selection Sort)"""
import json
def selection():
    """Labs 11.05 - Seats Number (Selection Sort)"""
    mylist = json.loads(input())
    last = int(input())
    time = 0
    ccc = 0
    while True:
        if ccc == last:
            break
        sss = ccc
        www = ccc + 1
        while True:
            if www > last:
                break
            word_w = mylist[www]
            word_s = mylist[sss]
            if ord(word_w[0]) == ord(word_s[0]):
                if int(word_w[1:]) < int(word_s[1:]):
                    sss = www
            elif ord(word_w[0]) < ord(word_s[0]):
                sss = www

            www += 1
            time += 1
        mylist[ccc], mylist[sss] = mylist[sss], mylist[ccc]
        print(mylist)
        ccc += 1
    print("Comparison times:", time)

selection()
