# BOJ 2444

user_input = int(input())

for i in range(1, user_input*2):
    temp = abs(user_input - i)
    print(' ' * temp + '*' * ((user_input - temp) * 2 - 1))
