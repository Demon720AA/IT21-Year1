"""Labs 11.03 - bubbleSort()"""
import json
def bubblesort():
    """Labs 11.03 - bubbleSort()"""
    arr = json.loads(input())
    last_index = int(input()) + 1
    count = 0
    current = 0
    sortedd = False
    while current <= last_index and sortedd == False:
        sortedd = True
        walker = last_index - 1
        while walker > current:
            if arr[walker] < arr[walker - 1]:
                arr[walker], arr[walker - 1] = arr[walker - 1], arr[walker]
                sortedd = False
            count += 1
            walker -= 1
        print(arr)
        current += 1
    print("Comparison times: %d" % count)

bubblesort()
