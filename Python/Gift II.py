'''Gift II'''
def main():
    '''หาเลขคู่'''
    list1 = []
    for _ in range(8):
        gif = int(input())
        list1.append(gif)
    even_nos = [num for num in list1 if num % 2 == 0]
    print(even_nos[0])
main()
