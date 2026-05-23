n=int(input("Enter the number of rows: "))
for i in range(n):
    for j in range(0,n-i):
        print(" ",end="")
    for j in range(0,2*i+1):
        print("*",end="")
    for j in range(0,n-i):
        print(" ",end="")
    print()