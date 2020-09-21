import re

print(re.sub(r'ab', '*', 'abcd abcdex acbdef')) # exact match as there is no [] in the regular expression
print(re.sub('[ab]', '*', 'abcd abcdex acbdef')) # a or b match

print(re.sub('[ab][21]', '*', 'a1+2b+c3+d4')) # First a or b and next char is 1 or 2

print(re.sub('A.B', '*', 'ABCD, ACBD, BACD, A12BCD')) # . means one char between A and B
print(re.sub('A..B', '*', 'ABCD, ACBD, BACD, A12BCD')) # .. means 2 chars between A and B