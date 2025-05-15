s = input()
s = s.lower()
n = 0

vowels = "aeiou"
for i in s:
    if i in vowels:
        n += 1

print(n)