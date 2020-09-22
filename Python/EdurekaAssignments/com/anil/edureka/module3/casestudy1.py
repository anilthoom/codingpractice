# 1. A Robot moves in a Plane starting from the origin point (0,0). The robot can move
#     toward UP, DOWN, LEFT, RIGHT. The trace of Robot movement is as given
#     following:
#     UP 5
#     DOWN 3
#     LEFT 3
#     RIGHT 2
#     The numbers after directions are steps. Write a program to compute the
#     distance current position after sequence of movements.
import math

startPoint = [0]
endPoint = [0]
print(math.dist([0],[0])+math.dist([5],[0])+math.dist([3],[0])+math.dist([0],[3])+math.dist([0],[2]))

# 2. Data of XYZ company is stored in sorted list. Write a program for searching
#     specific data from that list.
#     Hint: Use if/elif to deal with conditions.
empList = list(("others", "anil", "shrihan", "shritha"))
empList.sort()
searchStr = input("Enter employee name, you want to search\n")
isFound = False
for emp in empList:
    if(emp == searchStr):
        isFound = True
        break
if(isFound):
    print("Employee found")
else:
    print("Employee does not exist in repository")

# 3. Weather forecasting organization wants to show is it day or night. So, write a
#     program for such organization to find whether is it dark outside or not.
#     Hint: Use time module.
import datetime

currentDateTime = datetime.datetime.now()
print(currentDateTime.hour)
if currentDateTime.hour >= 19 or currentDateTime.hour <= 6:
    print("It's dark outside!! Take torch light with you!!")
else:
    print("It bright outside... enjoy D vitamin .... ")

# 4. Write a program to find distance between two locations when their latitude and
#     longitudes are given.
from math import sin, cos, atan2, radians
lat1 = radians(52.2296756)
lon1 = radians(21.0122287)
lat2 = radians(52.406374)
lon2 = radians(16.9251681)
print(lat1, lon1, lat2, lon2)