import numpy as np

a = np.array(42)
b = np.array([1, 2, 3, 4, 5])
c = np.array([[1, 2, 3], [4, 5, 6]])
d = np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])

print(a.ndim)
print(b.ndim)
print(c.ndim)
print(d.ndim)

print(b[1] + b[4])
print("Indexes example usage : ", d[0,1], d[1][1])
print(d[1,1,2])
arr = np.array([1, 2, 3, 4], ndmin=5)

print(arr)
print('number of dimensions :', arr.ndim)

# Array Slicing
age = np.array([10, 20, 30, 40, 50, 60])
print(age[2:1000])
print(age[1:])
print(age[:4])
print("Negative index : ", age[-3:-2])

students = np.array(["Anil", "Shrihan", "Shritha", "Ramya", "Abc", "Bde"])

print(students[:2])
print(students[1:6:2])
