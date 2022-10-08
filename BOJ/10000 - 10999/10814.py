import sys

n = int(sys.stdin.readline())
arr = sorted([list(sys.stdin.readline().split()) for i in range(n)], key = lambda member : int(member[0]))
for i in arr:
    print(*i)