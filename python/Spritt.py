c = input()
num = c.split(" ")
a = int(num[0])
b = int(num[1])
d = 0

for i in range(1, a + 1):
    x = int(input())
    d = d + x

if d <= b:
    print("Jebb")
else:
    print("Neibb")