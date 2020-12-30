class CaIv:
    localV = "This is local"

    def SetSource(self, name):
        self.name = name


obj1 = CaIv()
print(obj1.localV)
obj1.localV = "This is changed by obj1"
print(obj1.localV)

obj2 = CaIv()
print(obj2.localV)


obj1.SetSource("Anil")
print(obj1.name)

obj2.SetSource("Kumar")
print(obj2.name)