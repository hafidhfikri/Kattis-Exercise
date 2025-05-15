n = int(input())
a = []
z = []
tmp = ""

for i in range(1, n + 1):
    y = input()
    a.append(y)

for i in a:
    if i == "Present!":
        z.append(tmp)
    tmp = i

list_hasil = [elemen for elemen in a if elemen not in z and elemen != "Present!"]

if len(list_hasil) == 0:
    print("No Absences")
else:
    for i in list_hasil:
        print(i)
