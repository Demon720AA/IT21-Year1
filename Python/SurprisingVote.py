'''SurprisingVote'''
def main():
    '''หาความห่างของคนมากสุด น้อยสุด'''
    per3 = float(input())
    max_per = float(input())
    process1 = (per3 - (max_per*2))
    print(("Not surprising" * (max_per - process1 <= 2)) + ("Surprising" * (max_per - process1 > 2)))
main()
