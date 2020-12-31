import sys

random_list=['a', 0, 2]

for entry in random_list:
    try:
        print("The entry is : ", entry)
        r = 2/int(entry)
        break
    except:
        print("Opps!! ", sys.exc_info()[0], " occured")
        print("Next entry")
    finally:
        print("Finally done... ")

print("Currect division happend and the result is ", r)