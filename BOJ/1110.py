# 문자열 인덱싱 풀이
n = input()
if len(n) == 1:
    n = "0" + n
result = n
cnt = 0

while (True):
    temp = str(int(result[0]) + int(result[1]))
    result = result[1] + temp[-1]
    cnt += 1

    if result == n:
        print(cnt)
        break

# 산술 연산자 풀이
# n = input()
# result = n
# cnt = 0

# while True:
#     temp = (result // 10) + (result % 10)
#     result = ((result % 10) * 10 + temp % 10)
#     cnt += 1

#     if result == n:
#         print(cnt)
#         break
