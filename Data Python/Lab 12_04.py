"""Labs 12.03 - Radio Stations"""
import json

def stanum(stations, find):
    """get number of station"""
    count = 0
    for i in stations:
        if i in find:
            count += 1
    return count

def findstations(stations):
    """Labs 12.03 - Radio Stations"""
    count = int(input())
    sta = []
    pick = []
    for _ in range(count):
        sta.append(json.loads(input()))
    while stations:
        best = 0
        name = ""
        for i in sta:
            if best < stanum(stations, i["Cities"]):
                best = stanum(stations, i["Cities"])
                name = i
        if name != "":
            pick.append(name["Name"])
            for i in name["Cities"]:
                if i in stations:
                    stations.remove(i)
            sta.remove(name)
        else:
            break
    print(sorted(pick))

findstations(json.loads(input()))
