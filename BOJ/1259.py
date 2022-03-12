while True:
    w = input()
    if (w == "0"): break
    print(f"{'yes' if w == w[::-1] else 'no'}")
