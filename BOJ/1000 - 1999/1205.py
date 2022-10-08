# BOJ 1205

n, new, p = map(int, input().split())

if n == 0:
    print(1)
else:
    rank = list(map(int, input().split()))
    rank.append(new)
    rank = sorted(rank, reverse=True)

    if (rank.index(new) + 1 > p) or (n == p and rank[-1] == new):
        print(-1)
    else:
        print(rank.index(new) + 1)
