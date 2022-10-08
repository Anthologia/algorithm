n = int(input())
arr = sorted([list(map(int, input().split())) for i in range(n)])
for i in arr:
    print(*i)