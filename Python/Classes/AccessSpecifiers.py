class AccessSpecifiersDemo:
    def __init__(self):
        self.__pri = ("I am PRIVATE variable")
        self._pro = ("I am PROTECTED variable")
        self.pub = ("I am PUBLIC variable")

    def __privateMeth(self):
        

asd = AccessSpecifiersDemo()
print(asd.pub)
print(asd._pro)
# print(asd.__pri)
