# BOJ 2693

t = int(input())
a = list(input().split() for _ in range(t))

for i in a:
    print(sorted([*map(int, i)])[-3])
