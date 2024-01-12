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
 
 
def main():
    mylist = SinglyLinkedList()
    for _ in range(int(input())):
        mylist.insert_last(input())
    mylist.traverse()
 
main()