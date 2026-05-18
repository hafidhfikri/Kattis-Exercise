import math 

s = float(input())

if (float(s) % 1) >=0.5:
    t = math.ceil(s)
else:
    t = round(s)

print(t)