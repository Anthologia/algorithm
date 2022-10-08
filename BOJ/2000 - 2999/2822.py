# BOJ 2822

sum = 0
l = []
nums = sorted(enumerate(int(input()) for _ in range(8)), key=lambda x: x[1])

for num in nums[3:]:
    sum += num[1]
    l.append(num[0] + 1)

print(sum)
print(*sorted(l))
