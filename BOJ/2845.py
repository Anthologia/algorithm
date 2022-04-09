l, p = map(int, input().split())
news = list(map(int, input().split()))
for new in news:
    print(new - (l * p), end=" ")
