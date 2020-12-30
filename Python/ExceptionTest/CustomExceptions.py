class ValueSmallError(Exception):
    # Rasied when value is less then 5
    pass


class ValueLargeError(Exception):
    # Rasied when value is greater then 10
    pass


try:
    val = int(input("Enter value between 5 to 10\n"))
    if val<5:
        raise ValueSmallError
    elif val>10:
        raise ValueLargeError
    else:
        print("Looks good bro !!", val)
except ValueSmallError:
    print("Value is very small bro!!")
except ValueLargeError:
    print("Value is too big bro!!")
except ValueError:
    print("Something went wrong")

