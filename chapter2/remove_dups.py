from collections import deque as LinkedList


def remove_dups(Ll):
    found = set()
    for n in list(Ll):
        if n in found:
            Ll.remove(n)
        else:
            found.add(n)
    return Ll


Ll = LinkedList()
Ll.append(1)
Ll.append(2)
Ll.append(3)
Ll.append(4)
Ll.append(1)
Ll.append(4)
for a in Ll:
    print(a)
print(Ll)
Ll.remove(1)
print(remove_dups(Ll))
