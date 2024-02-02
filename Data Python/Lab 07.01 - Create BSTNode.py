"""Lab 07.01 - Create BSTNode"""

class BSTNode:
    """BSTNode"""
    def __init__(self, data=None):
        """Init"""
        self.data = data
        self.left = None
        self.right = None

    def get_data(self):
        """Get Data"""
        return self.data

    def set_data(self, data):
        """Set Data"""
        self.data = data

    def get_left(self):
        """Get Left"""
        return self.left

    def set_left(self, node):
        """Set Left"""
        self.left = node

    def get_right(self):
        """Get Right"""
        return self.right

    def set_right(self, node):
        """Set Right"""
        self.right = node

PNEW_ = BSTNode(input())
print(PNEW_.get_data())
print(PNEW_.get_left())
print(PNEW_.get_right())
