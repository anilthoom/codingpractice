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

