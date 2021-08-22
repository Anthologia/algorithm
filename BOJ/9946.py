# BOJ 9946

count = 0

while True:
    w = list(input() for i in range(2))

    if (w[0] == 'END' and w[1] == 'END'):
        break
    
    count += 1

    if sorted(w[0]) == sorted(w[1]):
        print("Case {}: same".format(count))
    else:
        print("Case {}: different".format(count))
