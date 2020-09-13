class MC:
    def __init__(self):
        print("Constructed")

    @classmethod
    def customConstructor(cls, name):
        cls.name = name


