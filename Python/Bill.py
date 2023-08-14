'''Bill'''
def bill():
    """bill"""
    pay = int(input())
    process = pay*(10/100)
    if process <= 50:
        process = 50
    elif process >= 1000:
        process = 1000
    process2 = (pay + process)*(7/100)
    print("%.2f" %(pay+process+process2))
bill()
