"""Student Class"""
class Student:
    """Create 1 Student"""
    def __init__(self, std_id=0, name="", gpa=0.0):
        """Set Student [ID, Name, GPA]"""
        self.std_id = int(std_id)
        self.name = str(name)
        self.gpa = float(gpa)

    def get_std_id(self):
        """Get Student ID"""
        return int(self.std_id)

    def get_name(self):
        """Get Student Name"""
        return str(self.name)

    def get_gpa(self):
        """Get Student GPA"""
        return float(self.gpa)

    def print_details(self):
        """Print Student [ID, Name, GPA]"""
        print("ID: %d\nName: %s\nGPA: %.02f" %(self.get_std_id(), self.get_name(), self.get_gpa()))

# ---TEST_GROUND------------------------------------------------------------------
import json
def main(text_in):
    """I love Laew Tae App"""
    std_in = json.loads(text_in)
    std = Student(std_in["ID"], std_in["Name"], std_in["GPA"])
    std.print_details()

main(input())
