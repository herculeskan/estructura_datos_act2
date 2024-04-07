import random

# Ejemplo de ordenamiento aleatorio
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9]
numeros_aleatorios = [0] * 9
numeros_ordenados = [0] * 9
contador = 0
existe = False

# Generar números aleatorios
while contador < 9:
    numero_aleatorio = random.randint(1, 9)
    for i in range(9):
        if numeros_aleatorios[i] == numero_aleatorio:
            existe = True
            break
    if not existe:
        numeros_aleatorios[contador] = numero_aleatorio
        contador += 1
    existe = False

# Ordenar números aleatorios
for i in range(9):
    numeros_ordenados[i] = numeros[numeros_aleatorios[i] - 1]

# Mostrar números aleatorios
print("Números aleatorios:")
for i in range(9):
    print(numeros_aleatorios[i], end=" ")
print()

# Mostrar números ordenados
print("Números ordenados:")
for i in range(9):
    print(numeros_ordenados[i], end=" ")
print()