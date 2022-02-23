from operator import itemgetter

pos = sorted([list(map(int, input().split())) for _ in range(int(input()))], key=itemgetter(1, 0))
for i in pos:
    print(*i)
