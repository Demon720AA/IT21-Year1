'''SecondConverter'''
def convert():
    '''นับเวลา'''
    k_num = int(input())#secound
    s_num = int(input())#secound in minute
    m_num = int(input())#minute in hour
    h_num = int(input())#hour in day
    process1 = h_num*m_num*s_num
    k_num = k_num % process1#Rest day
    mint = k_num // s_num#chang to minute
    sec = k_num % s_num#secound
    hor = mint // m_num#chang to hour
    mint = mint % m_num#minute
    # hor = hor % h_num#hour
    print(("%d:%d:%d" % (hor, mint, sec)))
convert()
