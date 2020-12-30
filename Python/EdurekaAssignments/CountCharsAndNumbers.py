a = input("Enter a word, which can contains charecters and numbers \n")
numInts = 0
numChars = 0
length = len(a)-1

while length >= 0:
    b = a.__getitem__(length)
    if b.isnumeric():
        numInts += 1
    elif b.isidentifier():
        numChars += 1
    length = length - 1

print("LETTERS : "+format(numChars))
print("DIGITS : "+format(numInts))