n = int(input())
a = list(map(int,input().split()))

res = 0

def check1(x):
    for i in range(x):
        if a[i] <= a[x]:
            return False
    return True

def check2(x):
    for i in range(x):
        if a[i] >= a[x]:
            return False
    return True

for i in range(1,n):
    if check1(i):
        res += 1
    if check2(i):
        res += 1

print(res)
