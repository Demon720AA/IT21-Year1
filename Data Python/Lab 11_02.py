"""Labs 11.02 - selectionSort()"""
import json
def selectionsort():
    """Labs 11.02 - selectionSort()"""
    arr = json.loads(input())
    last_index = int(input())
    count = 0
    for i in range(last_index):
        min_index = i
        for j in range(i+1, last_index+1):
            if arr[j] < arr[min_index]:
                min_index = j
            count += 1
        arr[i], arr[min_index] = arr[min_index], arr[i]
        print(arr)
    print("Comparison times: %d" % count)

selectionsort()
