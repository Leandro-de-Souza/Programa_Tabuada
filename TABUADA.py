
N = int(input("Deseja a tabuada para qual valor? "))

multiplicacao = 0

for i in range(1, 11):
    multiplicacao = N * i
    print(f"{N} x {i} = {multiplicacao}")
