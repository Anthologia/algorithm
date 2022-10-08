# BOJ 2751

# n = int(input())
# nums = sorted(set(input() for _ in range(n)))

# for num in nums:
#     print(num)
# 얘가 왜 안돌아가지...

n = int(input())
num = []

for i in range(n):
    num.append(int(input()))

num = sorted(set(num))

for i in num:
    print(i)
