def erect_pyramid(N):
    for i in range(N):
        row = " " * (N - i - 1) + "*" * (2 * i + 1) + " " * (N - i - 1)
        print(row)

def inverted_pyramid(N):
    for i in range(N):
        row = " " * i + "*" * (2 * N - (2 * i + 1)) + " " * i
        print(row)

def main():
    N = 5
    erect_pyramid(N)
    inverted_pyramid(N)

if __name__ == "__main__":
    main()
