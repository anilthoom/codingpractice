# reduce function
from functools import reduce
p = reduce(lambda x, y: x*y, [1,2,3,4,5])
print(p)

# Lambda, filter function
ints = range(-5,5)
negative = list(filter(lambda x: x<0, ints))
print(negative)

# Lambda, map function
items = [1,2,3,4,5]
li = list(map(lambda item: item**2, items))
print(li)

# Lambda function
ans = lambda z:z*4
print(ans(20))

# all(): Checks if all the elements are true
result = all([1,-2, 3, 4, True])
print(result) # True
result = all([1,2, 3, 4, None])
print(result) # False


# Sorted()
nums = [12, 2, 34, 5, 9]
print(nums)
sortedNums = sorted(nums)
print(sortedNums)
