# BOJ 1181

n = int(input())
w = list(set((input() for _ in range(n))))

for i in range(len(w)):
    w[i] = [len(w[i]), w[i]]

w.sort()

for i in range(len(w)):
    print(w[i][1])
