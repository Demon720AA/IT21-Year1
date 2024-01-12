class DataNode:
    def __init__(self, data=None):
        self.data = data
        self.next = None
  
    def get_data(self):
        return self.data
  
    def set_data(self, data):
        self.data = data
  
    def get_next(self):
        return self.next
  
    def set_next(self, next):
        self.next = next
     
class SinglyLinkedList:
    def __init__(self):
        self.count = 0
        self.head = DataNode()
 
    def insert_last(self, data):
        val = self.head
        word = DataNode(data)
        while val.get_next() != None:
            val = val.get_next()
        val.set_next(word)
        self.count += 1
 
    def traverse(self):
        if self.count == 0:
            print("This is an empty list.")
        else:
            val = self.head.get_next()
            while val != None:
                if val.get_next() != None:
                    print(val.get_data(), end=" -> ")
                else:
                    print(val.get_data())
                val = val.get_next()
     
    def insert_front(self, data):
        word = DataNode(data)
        word.set_next(self.head.get_next())
        self.head.set_next(word)
        self.count += 1
 
def main():
    mylist = SinglyLinkedList()
    for _ in range(int(input())):
        text = input()
        condition, data = text.split(": ")
        if condition == "F":
            mylist.insert_front(data)
        elif condition == "L":
            mylist.insert_last(data)
        # elif condition == "B":
        #     mylist.insert_before(*data.split(", "))
        # elif condition == "D":
        #     mylist.delete(data)
        else:
            print("Invalid Condition!")
    mylist.traverse()
 
 
main()