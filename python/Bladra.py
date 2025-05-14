c = input()
num = c.split()

v = int(num[0])
a = int(num[1])
t = int(num[2])

rumus = (v * t) + (0.5 * a * t ** 2)
print(rumus)