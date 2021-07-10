# BOJ 2445

user_input = int(input())

for i in range(1, user_input * 2):
    temp = abs(user_input - i)
    print('*' * (user_input - temp) + ' ' * (temp * 2) + '*' * (user_input - temp))