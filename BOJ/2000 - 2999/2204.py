# BOJ 2204

results = []
while True:
    n = int(input())    
    if n == 0: break

    results.append(sorted(list(input() for _ in range(n)), key=lambda x: x.lower())[0])

for result in results:
    print(result)
