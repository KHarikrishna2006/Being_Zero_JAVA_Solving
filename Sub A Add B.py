# cook your dish here
t=int(input())
while t!=0:
    n,a,b=map(int,input().split())
    while n>=a:
        n-=a
        n+=b
    print(n)
    t-=1
