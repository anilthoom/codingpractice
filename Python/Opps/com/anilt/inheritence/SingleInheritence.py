class Base1:
    def fun(self):
        print("In Base1 Class")


class Sub(Base1):
    pass


obj = Sub()
obj.fun()
