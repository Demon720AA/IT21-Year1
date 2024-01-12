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
     
test = DataNode()
test.set_data(input())
print(test.get_data())
print(test.get_next())
