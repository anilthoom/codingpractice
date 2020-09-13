class CaIv:
    localV = "This is local"

    def SetSource(self, name):
        self.name = name


obj1 = CaIv()
print(obj1.localV)
obj1.localV = "This is changed by obj1"
print(obj1.localV)

obj2 = CaIv()
