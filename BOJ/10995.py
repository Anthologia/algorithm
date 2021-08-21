# BOJ 10995

n = int(input())
for i in range(n):
	if i % 2:
		print(' ' + '* ' * (n - 1) + '*')
	else:
		print('* ' * (n - 1) + '*')