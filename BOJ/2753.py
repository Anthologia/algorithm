x = int(input())
print(int((x % 4 == 0) and (not(x % 100 == 0) or (x % 400 == 0))))