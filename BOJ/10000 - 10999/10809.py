s = input()
for i in range(97, 123):
    print(s.find(chr(i)), end=' ')

# result = [-1 for _ in range(26)]
# for i, v in enumerate(input(), 0):
#     if result[ord(v) - 97] == -1: result[ord(v) - 97] = i
# print(*result)
