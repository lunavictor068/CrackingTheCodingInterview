
# with dictionary
def is_unique(string):
    seen = set()
    for c in string:
        if c in seen:
            return False
        else:
            seen.add(c)
    return True


# no data structures
def is_unique_d(string):
    seen = []
    for c in string:
        if c in seen:
            return False
        else:
            seen.append(c)
    return True

print("qwerty", is_unique_d("qwerty"))
print("112345", is_unique_d("112345"))
print("123455", is_unique_d("123455"))
print("123345", is_unique_d("123345"))
print("123456", is_unique_d("123456"))
