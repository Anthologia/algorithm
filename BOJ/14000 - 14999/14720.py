n = int(input())
stores = list(map(int, input().split()))

drinks = 0
for store in stores:
    if (store == drinks % 3):
        drinks += 1

print(drinks)
