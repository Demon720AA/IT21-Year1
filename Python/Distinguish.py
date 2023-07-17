'''Distinguish'''
def main():
    '''main'''
    tall = int(input())
    print(("You're hit the door edge." * (tall > 180)) + ("Nothing happens." * (tall <= 180)))
main()
