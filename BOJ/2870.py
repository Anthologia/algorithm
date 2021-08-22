# BOJ 2870

import re

n = int(input())
words = list(input() for i in range(n))
l = []

for word in words:
    l.append(re.findall('\d+', word))

for i in sorted(list(map(int, sum(l, [])))):
    print(i)
