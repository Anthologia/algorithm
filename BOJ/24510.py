c = int(input())
cnt = 0
for i in range(c):
    str = input()
    cnt = max(str.count('for') + str.count('while'), cnt)

print(cnt)