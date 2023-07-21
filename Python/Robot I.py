'''Robot I'''
def main():
    '''ตรวจคนเข้าร้าน'''
    name = input()
    age = float(input())
    print(("%s, you can pass." %name * (age < 18)) + \
    ("%s, you shall not pass." %name * (age >= 18)))
main()
