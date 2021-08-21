# BOJ 10996
import math

n = int(input())
for i in range(n):
	print('* ' * (int(math.ceil(n / 2.0)) - 1) + '*')
	print(' *' * ((n - int(math.ceil(n / 2.0)))))
