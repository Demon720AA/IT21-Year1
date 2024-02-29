"""Labs 12.02 - (2) Knapsack"""
class Item:
    """Labs 12.02 - (1) Item Class"""
    def __init__(self, name, price, weight):
        """init"""
        self.name = name
        self.price = price
        self.weight = weight
        self.cost = 0

    def get_name(self):
        """docs"""
        return self.name

    def get_price(self):
        """docs"""
        return self.price

    def get_weight(self):
        """docs"""
        return self.weight

    def get_cost(self):
        """docs"""
        return self.price/self.weight

def knapsack(amount, itemlist):
    """Haaaaaaa"""
    print("Knapsack Size: %.1f kg\n===============================" %amount)
    total = 0
    while True:
        maxs = 0
        weight = ""
        dels = ""
        best = ""
        for i in itemlist:
            if (best == "" or i.get_cost() > best) and i.get_weight() <= amount:
                maxs = i.get_price()
                weight = i.get_weight()
                name = i.get_name()
                dels = i
                best = i.get_cost()
        if dels != "":
            print("%s ->" %name, weight, "kg -> %d THB" %maxs)
            total += maxs
            amount -= weight
            itemlist.remove(dels)
        else:
            break
    print("Total: %d THB" %total)

def main():
    """main"""
    import json
    items = []
    num_items = int(input())
    while num_items != 0:
        item_in = json.loads(input())
        items.append(
            Item(item_in['name'], item_in['price'], item_in['weight']))
        num_items = num_items - 1
    knapsack_capacity = float(input())
    knapsack(knapsack_capacity, items)

main()
