# BOJ 2522

n = int(input())
for i in range(1, n * 2):
	print('{}{}'.format(' ' * abs(n - i), '*' * (n - abs(n - i))))
