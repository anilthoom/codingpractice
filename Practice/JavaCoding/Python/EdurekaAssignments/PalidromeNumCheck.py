str1 = input("Enter a number to check if it is a palindrome\n")
a = int(str1)

# reverse number
reverseNum = 0
while a > 0:
    remainder = a % 10
    reverseNum = (reverseNum * 10) + remainder
    a = a//10

if int(str1) == reverseNum:
    print(format(str1)+" is a palindrome.")
else:
    print(format(str1) + " is NOT a palindrome.")