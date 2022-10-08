# BOJ 13752

n = int(input())
k = list(range(n))

for i in range(n):
	k[i] = int(input())

for i in range(len(k)):
	print('=' * k[i])
