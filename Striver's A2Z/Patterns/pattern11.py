n=int(input("Enter the number of rows: "))
for i in range(n+1):
    if i%2==0 : start=1
    else: start=0

    for j in range(i):
        print(start,end="")
        start=1-start
    print()