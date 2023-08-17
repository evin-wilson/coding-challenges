# https://www.codechef.com/problems/AGELIMIT

# cook your dish here
T = int(input())
for _ in range(T):
    min_age, max_age, age = map(int, input().split())
    if (age >= min_age and age< max_age):
        print('YES')
    else:
        print('NO')
