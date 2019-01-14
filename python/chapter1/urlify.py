def urlify(string, length):

    for i in range(0, len(string), 1):
        if string[i] == " ":
            string = string[:i] + "%20" + string[i + 1:-2]
    return string


test_cases = [
    ("s b  ", 3),
    ("sj sf kj    ", 8)
]

for test, length in test_cases:
    print(urlify(test, length))
