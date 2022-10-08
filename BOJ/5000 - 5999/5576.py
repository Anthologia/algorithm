# BOJ 5576

w_univ = [int(input()) for i in range(10)]
k_univ = [int(input()) for i in range(10)]

w_univ.sort()
k_univ.sort()

print(sum(w_univ[7:]), sum(k_univ[7:]))
