a = eval(input("Enter the number to find it's factors\n"))
resultEven = []
resultOdd = []
for x in range(1, (a // 2) + 1):
    if (a % x) == 0:  # Check if it is a factor
        if (x % 2) == 0:  # This will be true for Even numbers
            resultEven.append(x)
        else:  # For odd numbers
            resultOdd.append(x)
if (a % 2) == 0:
    resultEven.append(a)
else:  # For odd numbers
    resultOdd.append(a)

print(resultEven)
print(resultOdd)
