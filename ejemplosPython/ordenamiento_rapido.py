# Ejemplo de Ordenamiento rápido
numeros = [9, 8, 7, 6, 5, 4, 3, 2, 1]
numeros_ordenados = [0] * 9
pivote = numeros[0]
contador = 0

# Ordenar números
for i in range(1, 9):
    if numeros[i] < pivote:
        numeros_ordenados[contador] = numeros[i]
        contador += 1
numeros_ordenados[contador] = pivote
contador += 1
for i in range(1, 9):
    if numeros[i] > pivote:
        numeros_ordenados[contador] = numeros[i]
        contador += 1

# Mostrar números ordenados
print("Números ordenados:")
for i in range(9):
    print(numeros_ordenados[i], end=" ")
print()