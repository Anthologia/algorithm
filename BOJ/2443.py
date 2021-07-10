# BOJ 2443

user_input = int(input())

for i in range(user_input, 0, -1):
	print(' ' * (user_input - i) + '*' * (i * 2 - 1))