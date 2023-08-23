'''[Midterm 2022] Netflix'''
def process1(watch_same_time, download_on, tv_game, watch_on_moble_tablet, watch_on_laptop_tv, \
hd_available, ultra_hd):
    '''check'''
    # Premium
    if watch_same_time >= 4 and download_on >= 4 or (watch_same_time > 0 and download_on > 0 and ultra_hd == "yes"):
        premium_pack =+ 1
        watch_same_time =- 4
        download_on =- 4
    # Standard
    elif watch_same_time >= 2 and download_on >= 2 or (watch_same_time > 0 and download_on > 0 and hd_available == "yes"):
        standard_pack =+ 1
        watch_same_time =- 2
        download_on =- 2
    # Basic
    elif watch_same_time >= 1 and download_on >= 1 and watch_on_laptop_tv == "Yes":
        basic_pack =+ 1
        watch_same_time =- 1
        download_on =- 1
    # Mobile
    elif watch_same_time >= 1 and download_on >= 1:
        mobile_pack =+ 1
        watch_same_time =- 1
        download_on =- 1
    return premium_pack, standard_pack, basic_pack, mobile_pack

def process_print(premium_pack, standard_pack, basic_pack, mobile_pack):
    '''print'''
    print((("Premium x %d\n" %(premium_pack))*(premium_pack > 0)) + (("Standard  x %d\n" %(standard_pack))*(standard_pack > 0)))
def main():
    '''input'''
    watch_same_time = int(input())  #  Number of screens you can watch on at the same time
    download_on = int(input())      # Number of phones or tablets you can have downloads on
    tv_game = input()               # Unlimited movies, TV shows and mobile games
    watch_on_moble_tablet = input() # Watch on your mobile phone and tablet
    watch_on_laptop_tv = input()    # Watch on your laptop and TV
    hd_available = input()          # HD available
    ultra_hd = input()              # Ultra HD available
    premium_pack, standard_pack, basic_pack, mobile_pack = process1(watch_same_time, download_on, tv_game, watch_on_moble_tablet, watch_on_laptop_tv, \
hd_available, ultra_hd)
    process_print(premium_pack, standard_pack, basic_pack, mobile_pack)
main()
