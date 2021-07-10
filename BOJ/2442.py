# BOJ 2442

user_input = int(input())

for i in range(1, user_input + 1):
	print(' ' * (user_input - i) + '*' * (i * 2 - 1))