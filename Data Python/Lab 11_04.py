'''Labs 11.04 - Seats Number (Insertion Sort)'''
import json
def insertion():
    '''Labs 11.04 - Seats Number (Insertion Sort)'''
    mylist = json.loads(input())
    last = int(input())
    time = 0
    ccc = 1
    while ccc <= last:
        hold = mylist[ccc]
        walker = ccc - 1
        while True:
            if walker < 0 or (ord(hold[0]) > ord(mylist[walker][0])):
                break
            if hold[0] == (mylist[walker])[0]:
                if int(hold[1:]) >= int(mylist[walker][1:]):
                    break
            mylist[walker+1] = mylist[walker]
            walker -= 1
            time += 1
        mylist[walker+1] = hold
        time += 1
        ccc += 1
        print(mylist)
        if walker < 0:
            time -= 1
    print("Comparison times:", time)

insertion()
