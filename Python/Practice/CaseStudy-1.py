# ---------- 1 ----------#
nums = set([1, 1, 2, 3, 3, 3, 4, 4])
print(len(nums))

# ---------- 2 ----------#
d = {"john": 40, "peter": 45}
print(list(d.keys()))

# ---------- 3 ----------#
'''
A website requires a user to input username and password to register.
Write a program to check the validity of password given by user.
Following are the criteria for checking password:
1. At least 1 letter between [a-z]
1. At least 1 letter between [A-Z]
2. At least 1 number between [0-9]
3. At least 1 character from [$#@]
4. Minimum length of transaction password: 6
5. Maximum length of transaction password: 12
'''
password = input("Please enter your password\n")
passwordLen = len(password)
smallalpha = 'false'
upperalpha = 'false'
digit = 'false'
specialchar = 'false'
passwordLength = 'true'
if passwordLen < 6 or passwordLen > 12:
    print("Password length provided by you is %s character length. Password mininum length should 6 and maximum "
          "should be 12" % passwordLen)
    passwordLength = 'false'
else:
    for x in password:
        if x.isalpha():
            if x.islower():
                smallalpha = 'true'
            elif x.isupper():
                upperalpha = 'true'
        elif x.isdigit():
            digit = 'true'
        elif x == '$' or x == '#' or x == '@':
            specialchar = 'true'

if smallalpha == 'false' or upperalpha == 'false' or digit == 'false' or specialchar == 'false' or passwordLength == 'false':
    print("INVALID PASSWORD")
else:
    print("Valid Password!")

# ---------- 4 ----------#
a = [4, 7, 3, 2, 5, 9]
for x in a:
    print("Index of element %s is %s" % (x, a.index(x)))

# ---------- 5 ----------#
evenIndexPblm = input("Enter the string\n")
result = ""
for x in evenIndexPblm:
    if evenIndexPblm.index(x) % 2 == 0:
        result = result + x
print(result)

# ---------- 6 ----------#
strReverPblm = input("Enter the string to reverse\n")
str1 = reversed(strReverPblm)
str2 = ""
for x in str1:
    str2 = str2+x
print(str2)

# ---------- 7 ----------#
charCountStr = input("Enter any string\n")
charSet = set(charCountStr)
print(charSet)
for x in charSet:
    print(x, charCountStr.count(x))

# ---------- 8 ----------#
list1 = [1,3,6,78,35,55]
list2 = [12,24,35,24,88,120,155]
list3 = []
for x in list1:
    if list2.count(x) > 0 and list3.count(x) == 0:
        list3.append(x)
print(list3)

# ---------- 9 ----------#
givenList = [12,24,35,24,88,120,155,88,120,155]
uniqueList = []
for x in givenList:
    if uniqueList.count(x) == 0:
        uniqueList.append(x)
print(uniqueList)

# ---------- 10 ----------#
comprehensionList = [x for x in [12,24,35,24,88,120,155] if x != 24]
print(comprehensionList)

# ---------- 11 ----------#
listC = [12,24,35,70,88,120,155]
print([x for x in listC if listC.index(x) not in (0,4,5)])

# ---------- 12 ----------#
list57 = [x for x in [12,24,35,70,49,88,120,155] if (x%5!=0 or x%7!=0)]
print(list57)

# ---------- 13 ----------#
listDiv57 = [x for x in range(1, 1000) if (x%5==0 and x%7==0)]
print(listDiv57)

# ---------- 14 ----------#
inputNo = int(input("Enter value n: Result will be 1/2+2/3+3/4+...+n/n+1\n"))
result = float(0)
for x in range(1, inputNo+1):
    result += x/(x+1)
print(result)