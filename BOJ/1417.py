import heapq

n = int(input())
dasom = int(input())
votes = 0
queue = []

for _ in range(n-1):
    heapq.heappush(queue, -int(input()))

while queue:
    candidate = -heapq.heappop(queue)
    if dasom > candidate:
        break
    dasom += 1
    votes += 1
    heapq.heappush(queue, -(candidate-1))

print(votes)