"""Lab 07.06 - Binary Search Tree (Delete All Cases)"""
class BSTNode:
    """BSTNode"""
    def __init__(self, data) -> None:
        """Initiation"""
        self.data = int(data)
        self.left = None
        self.right = None

    def set_data(self, data):
        """Setting Data"""
        self.data = int(data)

    def set_left(self, left_node):
        """Left Side"""
        self.left = left_node

    def set_right(self, right_node):
        """Right Side"""
        self.right = right_node

    def get_data(self):
        """Return Data"""
        return self.data

    def get_left(self):
        """Return Left"""
        return self.left

    def get_right(self):
        """Return Right"""
        return self.right

class BST:
    """BST"""
    def __init__(self) -> None:
        """Initiation"""
        self.root = None

    def get_root(self):
        """Getting Root"""
        return self.root

    def set_root(self, root):
        """Setting Root"""
        self.root = root

    def insert(self, data):
        """Insert"""
        self.root = self._insert(self.root, data)

    def _insert(self, root, data):
        """Insertion"""
        if root is None:
            return BSTNode(data)
        if data < root.data:
            root.left = self._insert(root.left, data)
        elif data > root.data:
            root.right = self._insert(root.right, data)
        return root

    def preorder(self) -> None:
        '''output'''
        start = self.get_root()
        def recursion(start):
            '''rere kaw san'''
            if start != None:
                print('->', start.get_data(), end=' ')
                recursion(start.get_left())
                recursion(start.get_right())
        recursion(start)
        print()

    def is_empty(self):
        """Empty"""
        return self.root is None

    def inorder(self) -> None:
        '''just 1 more recursion'''
        def recursion(start):
            '''nah only 1 more recursion wont make it that slow'''
            if start != None:
                recursion(start.get_left())
                print('->', start.get_data(), end=' ')
                recursion(start.get_right())
        recursion(self.get_root())
        print()

    def postorder(self) -> None:
        '''the last recursion for sure'''
        def recursion(start):
            '''just a little bit man just only 1 more'''
            if start != None:
                recursion(start.get_left())
                recursion(start.get_right())
                print('->', start.get_data(), end=' ')
        recursion(self.get_root())
        print()

    def traverse(self):
        """Traversing and Show Output"""
        if self.is_empty():
            return print("This is an empty binary search tree.")
        print('Preorder: ', end='')
        self.preorder()
        print('Inorder: ', end='')
        self.inorder()
        print('Postorder: ', end='')
        self.postorder()

    def _find_min(self, root):
        """Using"""
        if self.is_empty():
            return None
        cur = root
        while cur.left:
            cur = cur.left
        return cur.data

    def find_min(self):
        """Finding Minimum"""
        return self._find_min(self.root)

    def find_max(self):
        """Using"""
        return self._find_max(self.root)

    def _find_max(self, root):
        """Finding Maximum"""
        if self.is_empty():
            return None
        cur = root
        while cur.right:
            cur = cur.right
        return cur.data

    def delete(self, data):
        """delete"""
        self.root = self._delete(self.root, data)

    def _delete(self, root, data):
        """recursive delete function"""
        if root is None:
            print("Delete Error, %s is not found in Binary Search Tree." % data)
            return None

        if data < root.get_data():
            root.set_left(self._delete(root.get_left(), data))
        elif data > root.get_data():
            root.set_right(self._delete(root.get_right(), data))
        else:
            if root.get_left() is None:
                return root.get_right()
            elif root.get_right() is None:
                return root.get_left()

            root.set_data(self._find_max(root.get_left()))
            root.set_left(self._delete(root.get_left(), root.get_data()))

        return root

def main():
    """Main Function"""
    my_bst = BST()
    for _ in range(int(input())):
        my_bst.insert(int(input()))
    my_bst.traverse()

main()
