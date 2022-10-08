# BOJ 1427

n = int(input())
l = []

for i in range(len(str(n))):
    l.append(str(n)[i])

print(''.join(sorted(l, reverse=True)))
