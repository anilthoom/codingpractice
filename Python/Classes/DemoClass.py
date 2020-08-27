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

    def meth(self):
        self.va = ("public bhai")

ob = Class1()
print(ob.pub)
print(ob._pro)
print()
# print(ob.__pri)

# result = ob.add()
# print(result)