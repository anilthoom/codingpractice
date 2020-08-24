# collections as argument : Variable length
def collMethod(arg1, arg2, *args, **dics):
    print("First arg : ", arg1)
    print("Second arg : ", arg2)
    for var in args:
        print("ARGS : ", var)
    print("Multiple values : ", args)
    print("Dictionary values : ", dics)

collMethod(1, 2, 10,20,30, 40, name="Anil", age = 30, country="India")



# Default value for param
def printDetails(name, age=30):
    print(name,age)
    return ()

printDetails("Anil")
printDetails("Ramya", 28)

def printStr():
    print("Hello Function")

printStr()
printStr()

def printWithParam(str):
    print("Hello ", str)
printWithParam("Anil")
printWithParam(str="Kumar")

def add(a,b):
    sum = a+b
    return (sum)
sum = add(121,221)
print(sum)
sum = add(b=20, a=10)
print(sum)