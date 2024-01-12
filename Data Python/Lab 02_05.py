class ArrayStack:
    """array stack"""
    def __init__(self):
        """init"""
        self.size = 0
        self.data = []
    def push(self, input_data):
        """push"""
        try:
            if input_data.isdigit():
                input_data = int(input_data)
            elif input_data.replace(".", "", 1).isdigit():
                input_data = float(input_data)
        except (TypeError, ValueError, ArithmeticError, AttributeError):
            pass
        finally:
            self.data.append(input_data)
            self.size += 1
    def pop(self):
        """pop"""
        if self.size > 0:
            self.size -= 1
            return self.data.pop()
        print("Underflow: Cannot pop data from an empty list")
        return None
    def is_empty(self):
        """is empty"""
        return not self.size
    def get_stack_top(self):
        """get stack top"""
        if self.size > 0:
            return self.data[-1]
        print("Underflow: Cannot get stack top from an empty list")
        return None
    def get_size(self):
        """get size"""
        return self.size
    def print_stack(self):
        """print stack"""
        print(self.data)

def is_parentheses_matching(expression):
    """ is parentheses matching"""
    check_stack = ArrayStack()
    check = True
    for char in expression:
        if char == "(":
            check_stack.push(char)
        elif char == ")":
            out = check_stack.pop()
            if out == None:
                check = False
    if check and check_stack.is_empty():
        print("Parentheses in", expression, "are matched")
        return True
    print("Parentheses in", expression, "are unmatched")
    return False
print(is_parentheses_matching(input()))