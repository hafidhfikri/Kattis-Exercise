# Python 3
line = input()
a, b = line.split()
a = int(a)
b = int(b)

if a > b:
    print(str(b)+ " " + str(a))
else:
    print(str(a) + " " + str(b))