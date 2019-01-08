def check_permutation(string1, string2):
    string1_l = list(string1)
    string2_l = list(string2)
    try:
        for c in string1_l:
            string2_l.remove(c)
    except ValueError:
        return False
    return len(string2_l) == 0


# test
print("abc, cbaa", check_permutation("abc", "cbaa"))
print("abc, cba", check_permutation("abc", "cba"))
print("abc, ab", check_permutation("abc", "ab"))
