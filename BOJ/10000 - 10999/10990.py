# BOJ 10990

n = int(input())
for i in range(1, n+1):
	print('{}{}{}'.format(' ' * (n - i), '*' + ' ' * (( i * 2 - 1) - 2), ('*' if i - 1 else '')))
    