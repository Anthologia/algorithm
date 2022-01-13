sentence = input()
ucpc = ["U", "C", "P", "C"]
cnt = 0
    
for i in ucpc:
    if i in sentence:
        sentence = sentence[sentence.find(i):]
        cnt += 1

if cnt == 4:
    print("I love UCPC")
else:
    print("I hate UCPC")