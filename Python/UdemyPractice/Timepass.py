import turtle

t = turtle.pen
for x in range(100):
    t.forward(x*2 + x+sides)
    t.left(90)
    t.width(x * sides/100)
    t.left(50)
