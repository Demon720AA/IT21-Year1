'''Hamburger'''
def hamburger():
    '''คุ้นๆ'''
    font = int(input())
    rear = int(input())
    print(("|"*font)+("*"*(2*(font+rear)))+("|"*rear))
hamburger()
