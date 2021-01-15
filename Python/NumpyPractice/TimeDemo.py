import datetime
import numpy as np
x = datetime.datetime.now()
print(x.hour,"This is in 24 hour formate")
print(x.minute,'This is minute')
students2 = np.array(["Anil", "Shrihan", "Shritha", "Ramya", "Abc", "Bde"], dtype='S')
print(students2.dtype)

intArr = np.array([0, 1, 2])
boolArr = intArr.astype(bool)
print(boolArr.dtype)
print(boolArr[2])
print('Thanks')
