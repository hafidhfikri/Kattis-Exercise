x = int(input())
y = None

for i in range(1, x + 1):
    a = int(input())

    if (y is None) or a < y:
        y = a

print(y)