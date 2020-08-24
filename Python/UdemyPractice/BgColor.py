import turtle

t = turtle.Pen()
t.pencolor("blue")
t.speed(0)
colors = ["red", "blue", "purple", "green", "orange"]
t.bgcolour =["black"]
print( colors[4] )
for x in range(100):
    t.pencolor( colors[x % 5] )
    t.forward(x*2)
    t.left(90)
