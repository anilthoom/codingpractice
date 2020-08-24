import turtle

t = turtle.Pen()
turtle.bgcolor("black")
t.speed(0)
colors = ["red", "blue", "purple", "green", "orange"]
sides  = eval(input("Enter the no of side you want\n"))
print( colors[4] )
for x in range(100):
    t.pencolor( colors[x % 5] )
    t.forward(x*2 + x+sides)
    t.left(90)
    t.width(x * sides/100)
