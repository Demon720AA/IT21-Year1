"""Lab 07.02 - Binary Search Tree (Preorder, Insert)"""

class BSTNode:
    """BSTNode"""
    def __init__(self, data=None):
        """Announced Initation"""
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
    def set_left(self, data):
        """Set Left"""
        self.left = data
    def get_right(self):
        """Get Right"""
        return self.right
    def set_right(self, data):
        """Set Right"""
        self.right = data
class BST:
    """BST"""
    def __init__(self):
        """Announced Initation"""
        self.root = None
    def get_root(self):
        """Get Root"""
        return self.root
    def set_root(self, data):
        """Set Root"""
        self.root = data
    def insert(self, data):
        """Insert"""
        self.root = self._insert_recursive(self.root, data)
    def _insert_recursive(self, node, data):
        """Insert Recursive"""
        if node is None:
            return BSTNode(data)
        if data < node.get_data():
            node.set_left(self._insert_recursive(node.get_left(), data))
        elif data > node.get_data():
            node.set_right(self._insert_recursive(node.get_right(), data))
        return node
    def preorder(self):
        """Preorder"""
        result = self._preorder_recursive(self.root)
        print(result, end="")

    def _preorder_recursive(self, node):
        """Preorder Recursive"""
        if node is None:
            return ""
        result = "-> " + str(node.get_data()) + " "
        result += self._preorder_recursive(node.get_left())
        result += self._preorder_recursive(node.get_right())
        return result

def main():
    """Main Function"""
    my_bst = BST()
    for _ in range(int(input())):
        my_bst.insert(int(input()))

    print("Preorder: ", end="")
    my_bst.preorder()

main()
