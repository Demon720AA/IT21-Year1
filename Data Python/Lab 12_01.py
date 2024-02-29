"""Labs 12.01 - Coin Exchange"""
def convert_key(data):
    """JSON"""
    return {int(k): v for k, v in data.items()}

def coinexchange(amount, coins):
    """Coin ex"""
    print("Amount: %d" %(amount))
    total = 0
    coin = 0
    lis = {10:0, 5:0, 2:0, 1:0}
    for i, j in coins.items():
        total += i * j
    if total >= amount:
        for i, j in coins.items():
            if amount <= 0:
                break
            if (i * j) <= amount:
                coin += j
                amount -= i * j
                lis[i] = j
            else:
                for k in range(j + 1):
                    if (i * k) > amount:
                        coin += k - 1
                        amount -= i * (k - 1)
                        lis[i] = k - 1
                        break
        print("Coin exchange result:")
        for i, j in lis.items():
            print("  %s baht = %d coins" %(i, j))
        print("Number of coins: %d" %coin)

    else:
        print("Coins are not enough.")

def main():
    """main"""
    import json
    value = int(input())
    data = convert_key(json.loads(input()))
    coinexchange(value, data)

main()
