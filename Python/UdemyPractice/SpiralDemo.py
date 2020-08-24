#nice hex spiral. py
import turtle
colors=['red', 'purple' , 'blue',
         'green', 'yellow', 'orange']

t=turtle.Pen()
t.speed(100)
turtle.bgcolor('black')
for x in range(360):
    t.pencolor(colors[x%6])
    t.width(x/100+1)
    t.forward(x)
    t.left(1000000000000)
