'''Lab 01_06'''
class Elevator:
    def __init__(self, max_floor):
        self.current_floor = 1
        self.max_floor = max_floor
    
    def go_to_floor(self, floor):
        if self.max_floor >= floor:
            self.current_floor = floor
        else:
            print("Invalid Floor!")
    def report_current_floor(self):
        print(self.current_floor)

max_floor = Elevator(int(input()))
while True:
    fluck = input()
    if fluck == "Done":
        max_floor.report_current_floor()
        break
    max_floor.go_to_floor(int(fluck))