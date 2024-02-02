def one_loop(l: list) -> bool:
    print(l)
    
    for i in range(len(l)):
        for k in range(len(l)):
            if l[i] == l[k] and i != k:
                return True
    return False

if __name__ == "__main__":
    print(one_loop([1, 1, 3, 4]))
