class Animal:
    def __init__(self, name):
        self.name = name

    def talk(self):
        pass


class Cat:
    def talk(self):
        print("Meow...")


class Dog:
    def talk(self):
        print("Woof...")


c = Cat()
c.talk()

d = Dog()
d.talk()