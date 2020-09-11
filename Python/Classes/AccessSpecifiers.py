class AccessSpecifiersDemo():
    def __init__(self):
        self.__pri = ("I am PRIVATE variable")
        self._pro = ("I am PROTECTED variable")
        self.pub = ("I am PUBLIC variable")

    def __privateMeth(self):
        print("In Private method")


ob = AccessSpecifiersDemo()
# print(ob.pub)
# print(ob._pro)
# print(ob.__pri)

ob._AccessSpecifiersDemo__privateMeth() # Accessing private method
print (ob._AccessSpecifiersDemo__pri) # Accessing private variable