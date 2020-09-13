class Base1:
    def fun(self):
        print("In Base1 Class")


class Sub(Base1):
    # pass
    def fun(self):
        print("In Sub Class")


obj = Sub()
obj.fun()
