def palindrome_permutation(string):
    seen = {}
    string = string.lower()
    for c in string:
        if c == " ":
            continue
        if c in seen:
            seen[c] = seen[c] + 1
        else:
            seen[c] = 1
    return not len([v for k, v in seen.items() if v % 2 != 0]) > 1

print(palindrome_permutation("taco cat"))
print(palindrome_permutation("cualquier"))
print(palindrome_permutation("race car"))
print(palindrome_permutation("Taco cat"))