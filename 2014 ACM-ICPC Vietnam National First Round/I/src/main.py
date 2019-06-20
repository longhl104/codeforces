t1 = float(input())
t = 0


def gcd(a, b):
    # if b == 0:
    #     return a
    # if a < b:
    #     t = a
    #     a = b
    #     b = t
    # return gcd(b, a % b)
    while b != 0:
        r = a % b
        a = b
        b = r
    return a


def rut_gon(a, b):
    pass


def process(n):
    try:
        nguyen, tp = n.split(".")
    except ValueError:
        nguyen = n
        tp = ""
    # print(nguyen,tp)
    if nguyen == "":
        nguyen = "0"
    n = nguyen + "." + tp
    not_rec = ""
    rec = ""
    ts = 0
    for i in tp:
        if i != '(':
            ts += 1
        else:
            break

    try:
        non, cur = tp.split("(")
        cur = cur[:len(cur) - 1]
    except ValueError:
        non = tp
        cur = ""
    # print(nguyen,tp,non,cur)
    if cur == "":
        a = pow(10, len(tp)) * float(n)
        b = pow(10, len(tp))
        a = int(a)
        b = int(b)
        g = gcd(a, b)
        a //= g
        b //= g
    else:
        a = int(float(nguyen + non + cur) - float(nguyen + non))
        b = int(pow(10, len(non+cur)) - pow(10, ts))
        g = gcd(a, b)
        a//=g
        b//=g
    print("Case #{}: ".format(t), end="")
    print("{}/{}".format(a,b))


while t < t1:
    t += 1
    n = input()
    process(n)
