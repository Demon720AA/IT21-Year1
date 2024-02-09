"""isIntersect(A, B, C)_Verson have enough sleep"""
import json
def isintersect():
    """Is A, B, C intersect together"""
    a_lis = json.loads(input())
    b_lis = json.loads(input())
    c_lis = json.loads(input())
    for data in a_lis:
        if data in b_lis and data in c_lis:
            return True
    return False
print(isintersect())
