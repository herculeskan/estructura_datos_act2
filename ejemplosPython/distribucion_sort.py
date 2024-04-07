# Ejemplo de distribución Sort
numeros = [9, 8, 7, 6, 5, 4, 3, 2, 1]
numeros_ordenados = [0] * 9
numeros_ordenados2 = [0] * 9
pivote = numeros[0]
pivote2 = numeros[8]
contador_pivote = 0
contador_pivote2 = 0

# Ordenar números
for i in range(9):
    if numeros[i] < pivote:
        numeros_ordenados[contador_pivote] = numeros[i]
        contador_pivote += 1
    if numeros[i] > pivote2:
        numeros_ordenados2[contador_pivote2] = numeros[i]
        contador_pivote2 += 1

# Mostrar números ordenados
print("Números ordenados:")
for i in range(contador_pivote):
    print(numeros_ordenados[i], end=" ")
for i in range(contador_pivote2):
    print(numeros_ordenados2[i], end=" ")
print()