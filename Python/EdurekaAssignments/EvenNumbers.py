a = 1000
b = 3000
str = ""
for x in range(a, b + 1):
    if (x % 2) == 0:
        str += x.__str__()
        if x != b:
            str += ","

print(str)
