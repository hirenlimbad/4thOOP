def fibonacci(n):
    a, b = 0, 1
    series = []
    for _ in range(n):
        series.append(a)
        a, b = b, a + b
    return series

if __name__ == '__main__':
    n = 10  # Change this value for a longer series
    print(fibonacci(n))
