"""Calculator"""
def calculator(num):
    """Calculator V3, the upgrade from PSCP code. Find how many time I click."""
    nine = ""
    delete = 0
    nlen = len(str(num)) + 1
    for _ in range(nlen-2):
        nine += "9"
        delete += int(nine)
    if num == 1:
        click = 1
    else:
        click = (num * nlen) - delete
    print(click)
calculator(int(input()))
