"""Labs 12.02 - (1) Item Class"""
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

def main():
    """docs"""
    import json
    item_in = json.loads(input())
    item = Item(item_in["name"], item_in["price"], item_in["weight"])
    print(item.get_name(), item.get_price(), item.get_weight(), sep='\n')

main()
