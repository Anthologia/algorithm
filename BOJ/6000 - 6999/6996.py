# BOJ 6996

n = int(input())
k = list(input().split() for i in range(n))

for i in range(len(k)):
    if sorted(k[i][0]) == sorted(k[i][1]):
        print("{} & {} are anagrams.".format(k[i][0], k[i][1]))
    else:
        print("{} & {} are NOT anagrams.".format(k[i][0], k[i][1]))
    