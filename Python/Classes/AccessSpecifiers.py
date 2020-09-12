class AccessSpecifiersDemo():
    def __init__(self):
        self.__pri = ("I am PRIVATE variable")
        self._pro = ("I am PROTECTED variable")
        self.pub = ("I am PUBLIC variable")

    def __privatemeth(self):
        print("In Private method")

    def _protectedmeth(self):
        print("In Protected method")


ob = AccessSpecifiersDemo()
# print(ob.pub)
# print(ob._pro)
# print(ob.__pri)

ob._AccessSpecifiersDemo__privateMeth() # Accessing private method
print (ob._AccessSpecifiersDemo__pri) # Accessing private variable
#print(ob._protectedmeth())
# STOPPED AT 1 HOUR RESUME FROM CONSTRUCTEOR  https://learning.edureka.co/classroom/recording/777/7014/123449?tab=CourseContent