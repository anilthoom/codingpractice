b = 20
class Class1():
    a = 10
    def add(self):
        return (b*b)

    def __init__(self):
        print("__privateMeth")
        self.pub = ("Public Method")
        self._pro = ("I am protected")
        self.__pri = ("I am private")

ob = Class1()
print(ob.pub)
print(ob._pro)
# print(ob.__pri)

result = ob.add()
print(result)