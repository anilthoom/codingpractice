class MC:
    def __init__(self):
        print("Constructed")

    @classmethod
    def customConstructor(cls, name):
        cls.name = name


# defaultObj = MC()
customObj = MC.customConstructor("Anil")
print(customObj.name)