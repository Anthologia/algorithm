# BOJ 2750

n = int(input())
k = list(int(input()) for i in range(n))

k.sort()

for i in range(len(k)):
    print(k[i])
