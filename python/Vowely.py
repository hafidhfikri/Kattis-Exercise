s = input()
s = s.lower()
n1 = 0
n2 = 0

vowels = "aeiou"
vowely = "aeiouy"

for i in s:
    if i in vowels:
        n1 += 1

for i in s:
    if i in vowely:
        n2 += 1

print(str(n1) + " " + str(n2))