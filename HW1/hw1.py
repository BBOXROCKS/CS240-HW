s = "Dominic"

for c in s:
    print(ord(c))

print("\n")
#Pythonic 

print(",".join(str(ord(c)) for c in s))