n=int(input("Enter the number of rows: "))

for i in range(n+1):
    for j in range(1,i+1):
        print(j,end="")
    for j in range(0,2*n-(2*i)):
        print(" ",end="")
    for j in range(i,0,-1):
        print(j,end="")
    print()

