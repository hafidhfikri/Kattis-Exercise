n = int(input())
s = []

for i in range(1, n + 1):
    st = input()
    if i%2 == 1:
        s.append(st)

for i in s:
    print(i)