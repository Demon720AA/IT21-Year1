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
def main(groups, student_num):
    """"main"""
    students_stack = ArrayStack()
    for _ in range(student_num):
        students_stack.push(input())
    while not students_stack.is_empty():
        for group in groups:
            if not students_stack.is_empty():
                group.append(students_stack.pop())
    for index in range(len(groups)):
        print("Group " + str(index + 1) + ": ", end="")
        print(*groups[index], sep=", ")
 
main([[] for _ in range(int(input()))], int(input()))