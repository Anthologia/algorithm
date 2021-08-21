# BOJ 10992

n = int(input())
for i in range(n, 0, -1):
	if i == 1:
		print(' ' * (i - 1) + '*' * ((2 * n) - 1))
	else:
		print(' ' * (i - 1) + '*' + ' ' * (2 * (n - i) - 1) + ('*' if n - i else ''))
		