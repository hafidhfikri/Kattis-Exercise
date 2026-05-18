s = input()
c = ""

for i in range(len(s), 0, -1):
    c = c+s[i-1]

print(c)