s = input()
t = ""
a_switch = 0

for i in s:
    if i == "a" or a_switch == 1:
        t = t + i
        a_switch = 1

print(t)