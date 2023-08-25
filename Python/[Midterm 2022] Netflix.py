'''[Midterm 2022] Netflix'''
def process1(watch_same_time, download_on, watch_on_laptop_tv, \
hd_available, ultra_hd):
    '''check'''
    premium_pack = 0
    standard_pack = 0
    basic_pack = 0
    mobile_pack = 0
    while watch_same_time > 0 or download_on > 0:
        # Premium
        if (watch_same_time >= 3 or download_on >= 3) and (watch_on_laptop_tv == "yes"):
            premium_pack += 1
            watch_same_time -= 4
            download_on -= 4
            continue
        elif ultra_hd == "yes":
            premium_pack += 1
            watch_same_time -= 4
            download_on -= 4
            continue
        # Standard
        elif (watch_same_time == 2 or download_on == 2) and watch_on_laptop_tv == "yes":
            standard_pack += 1
            watch_same_time -= 2
            download_on -= 2
            continue
        elif hd_available == "yes":
            standard_pack += 1
            watch_same_time -= 2
            download_on -= 2
            continue
        # Basic
        elif watch_on_laptop_tv == "yes":
            basic_pack += 1
            watch_same_time -= 1
            download_on -= 1
            continue
        # Mobile
        elif watch_same_time >= 1 or download_on >= 1:
            mobile_pack += 1
            watch_same_time -= 1
            download_on -= 1
            continue
    return premium_pack, standard_pack, basic_pack, mobile_pack

def process_print(premium_pack, standard_pack, basic_pack, mobile_pack):
    '''print'''
    if premium_pack > 0:
        print("Premium x %d" %(premium_pack))
    if standard_pack > 0:
        print("Standard x %d" %(standard_pack))
    if basic_pack > 0:
        print("Basic x %d" %(basic_pack))
    if mobile_pack > 0:
        print("Mobile x %d" %(mobile_pack))
    print("Total = %d THB" %((premium_pack*419)+(standard_pack*349)+(basic_pack*279)+\
(mobile_pack*99)))
def main():
    '''input'''
    watch_same_time = int(input())  #  Number of screens you can watch on at the same time
    download_on = int(input())      # Number of phones or tablets you can have downloads on
    input()                         # Unlimited movies, TV shows and mobile games
    input()                         # Watch on your mobile phone and tablet
    watch_on_laptop_tv = input().lower()    # Watch on your laptop and TV
    hd_available = input().lower()          # HD available
    ultra_hd = input().lower()              # Ultra HD available
    premium_pack, standard_pack, basic_pack, mobile_pack = process1\
(watch_same_time, download_on, watch_on_laptop_tv, hd_available, ultra_hd)
    process_print(premium_pack, standard_pack, basic_pack, mobile_pack)
main()
