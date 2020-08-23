from cryptography.fernet import Fernet

referenceId = input("Enter the encrypted reference id\n")
referenceIdLen = len(referenceId)
smallalpha = 'false'
upperalpha = 'false'
digit = 'false'
specialchar = 'false'
referenceIdLength = 'true'
if referenceIdLen < 6 or referenceIdLen > 12:
    print("ReferenceId length provided by you is %s character length. Password mininum length should 6 and maximum "
          "should be 12" % referenceIdLen)
    referenceIdLength = 'false'
else:
    for x in referenceId:
        if x.isalpha():
            if x.islower():
                smallalpha = 'true'
            elif x.isupper():
                upperalpha = 'true'
        elif x.isdigit():
            digit = 'true'
        elif x == '$' or x == '#' or x == '@':
            specialchar = 'true'

if smallalpha == 'false' or upperalpha == 'false' or digit == 'false' or specialchar == 'false' or referenceIdLength == 'false':
    print("ENTER VALID REFERENCE ID")
else:
    referenceId = str.encode(referenceId)
    key = Fernet.generate_key()
    firKey = Fernet(key)
    encodedRef = firKey.encrypt(referenceId)
    print("Here is your encoded Reference ID : ", encodedRef)
    msg = input("If you want to decrypt the message, paste the encrypted message here\n")
    decodedRef = firKey.decrypt(str.encode(msg))
    print(decodedRef)



