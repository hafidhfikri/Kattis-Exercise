t = int(input())
score = 0
best = ""

for i in range(t):
    c = input()
    s = c.split()

    a = s[0]
    b = int(s[1])

    if b > score:
        score = b
        best = a

print(best)