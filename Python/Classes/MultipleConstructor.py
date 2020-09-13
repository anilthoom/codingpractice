class MC:
    def __init__(self):
        print("Constructed")

    @classmethod
    def customConstructor(cls, name):
        cls.name = name


defaultObj = MC()
MC.customConstructor("Anil")
print(defaultObj.name)
