def solution(absolutes, signs):
    return sum([absolute * 1 if sign else absolute * -1 for absolute, sign in zip(absolutes, signs)])
