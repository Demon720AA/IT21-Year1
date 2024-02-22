"""Labs 11.01 - insertionSort()"""
import json
def insertionsort():
    """Labs 11.01 - insertionSort()"""
    arr = json.loads(input())
    last_index = int(input())
    count = 0
    for i in range(1, last_index + 1):
        key = arr[i]
        j = i-1
        while j >= 0 and key < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
            count += 1
        if key >= arr[j] and j != -1:
            count += 1
        arr[j+1] = key
        print(arr)
    print("Comparison times: %d" %count)

insertionsort()
