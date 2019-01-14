def one_away(string1, string2):
    if len(string1) >= len(string2):
        return len(remove_from(string1, string2)) <= 1
    else:
        return len(remove_from(string2, string1)) <= 1


def remove_from(string1, string2):
    string1 = list(string1)
    for c in string2:
        try:
            string1.remove(c)
        except ValueError:
            continue
    return string1


for s1, s2 in [("pale", "ale"), ("pales", "pale"), ("pale", "bale"), ("pale", "bake")]:
    print(one_away(s1, s2))
