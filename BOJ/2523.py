# BOJ 2523

n = int(input())
for i in range(1, n * 2):
	print('{}'.format('*' * (n - abs(n - i))))
